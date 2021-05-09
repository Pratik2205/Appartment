package com.mvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

public class LoginController extends HttpServlet
{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
    
        if(req.getParameter("btn_login")!=null){
            
            try {
                String email=req.getParameter("email");
                String password=req.getParameter("password");
                
                LoginBean loginBean=new LoginBean();
                loginBean.setEmail(email);
                loginBean.setPassword(password);
                
                LoginDao loginDao=new LoginDao();
                
                String authorize= loginDao.authorizeLogin(loginBean);
                
                if(authorize.equals("Login successful")){
                    HttpSession session=req.getSession();
                    session.setAttribute("name",loginBean.getName());
                    session.setAttribute("mobileno",loginBean.getMobileno());
                    RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
                    rd.forward(req, res);
                           
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }
}

package com.mvc.controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
import javax.servlet.ServletException;


public class RegisterController extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        if(req.getParameter("submit_btn")!=null)
        {
            String name=req.getParameter("name");
            String email=req.getParameter("email");
            Long mobileno=Long.parseLong(req.getParameter("mobileno"));
            String password=req.getParameter("password");
            String block=req.getParameter("block");
            int floorno=Integer.parseInt(req.getParameter("floorno"));
            int flatno=Integer.parseInt(req.getParameter("flatno"));
            int flattype=Integer.parseInt(req.getParameter("flattype"));
            
            RegisterBean registerbean=new RegisterBean();
            
            registerbean.setName(name);
            registerbean.setEmail(email);
            registerbean.setMobileno(mobileno);
            registerbean.setPassword(password);
            registerbean.setBlock(block);
            registerbean.setFloorno(floorno);
            registerbean.setFloorno(floorno);
            registerbean.setFlattype(flattype);
            
            RegisterDao registerdao=new RegisterDao();
            
            String registerValidate=registerdao.authorizeRegister(registerbean);
            if(registerValidate.equals("Successfully Registered...."))
            {
                req.setAttribute("RegisterSuccessMsg",registerValidate);
                RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
                rd.forward(req, res);
            }
            else
            {
                req.setAttribute("RegisterErrorMsg",registerValidate);
                RequestDispatcher rd=req.getRequestDispatcher("reg.jsp");
                rd.include(req, res);
            }
        }
    
    }
}

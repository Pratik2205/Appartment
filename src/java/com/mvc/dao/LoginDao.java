package com.mvc.dao;
import com.mvc.bean.LoginBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class LoginDao {
    public String authorizeLogin(LoginBean loginBean) throws SQLException{
        String email=loginBean.getEmail();
        String password=loginBean.getPassword();
        
        String dbemail="",dbpassword="";
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","pratik22");
            PreparedStatement pstat=null;
            pstat=conn.prepareStatement("select * from member where email=? and password=?");
            pstat.setString(1, email);
            pstat.setString(2, password);
            ResultSet rs=pstat.executeQuery();
            
            while(rs.next()){
                dbemail=rs.getString("email");
                dbpassword=rs.getString("password");
                
                if(email.equals(dbemail) && password.equals(dbpassword))
                { 
                    String name=rs.getString(1);
                    loginBean.setName(name);
                    Long mobileno=rs.getLong(3);
                    loginBean.setMobileno(mobileno);
                    return "Login successful";
                }
                
            }
            pstat.close();
            conn.close();
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return "Wrong Email and Password";
    }
    
    
}

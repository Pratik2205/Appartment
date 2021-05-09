package com.mvc.dao;
import com.mvc.bean.RegisterBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
    public String authorizeRegister(RegisterBean registerbean){
    
        String name=registerbean.getName();
        String email=registerbean.getEmail();
        Long mobileno=registerbean.getMobileno();
        String password=registerbean.getPassword();
        String block=registerbean.getBlock();
        int floorno=registerbean.getFloorno();
        int flatno=registerbean.getFlatno();
        int flattype=registerbean.getFlattype();
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","pratik22");
            PreparedStatement pstat=null;
            pstat=conn.prepareStatement("insert into member(name,email,mobileno,password,block,floorno,flatno,flattype) values(?,?,?,?,?,?,?,?)");
            pstat.setString(1,name);
            pstat.setString(2, email);
            pstat.setLong(3,mobileno);
            pstat.setString(4,password);
            pstat.setString(5,block);
            pstat.setInt(6, floorno);
            pstat.setInt(7, flatno);
            pstat.setInt(8,flattype);
            pstat.executeUpdate();
            
            pstat.close();
            conn.close();
            return "Successfully Registered....";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "Sorry not Registered....";
    }
    
}

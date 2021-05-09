package com.mvc.bean;

public class RegisterBean {
    private String name,email,password,block;
     private int floorno,flatno,flattype;
     private long mobileno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getFloorno() {
        return floorno;
    }

    public void setFloorno(int floorno) {
        this.floorno = floorno;
    }

    public int getFlatno() {
        return flatno;
    }

    public void setFlatno(int flatno) {
        this.flatno = flatno;
    }

    public int getFlattype() {
        return flattype;
    }

    public void setFlattype(int flattype) {
        this.flattype = flattype;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }
   
    
}

package com.gdaib.pojo;

public class Account {
    private Integer id;

    private String account;

    private String password;

    private Integer 
status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getstatus() {
        return 
status;
    }

    public void setstatus(Integer
status) {
        this.
status = 
status;
    }
}
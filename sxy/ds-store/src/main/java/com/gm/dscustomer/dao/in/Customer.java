package com.gm.dscustomer.dao.in;

public class Customer {
    private String username;
    private  String realName;
    private String mobile;
    private String email;
    private String password;
    private Boolean newsSubsribed;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public Boolean getNewsSubsribed() {
        return newsSubsribed;
    }

    public void setNewsSubsribed(Boolean newsSubsribed) {
        this.newsSubsribed = newsSubsribed;
    }
}

package com.oschina.ibatis.bean;

import java.util.Date;

public class User
{
    private String userName;
    private String emailAddress;
    private int age;
    private Date birthday;
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public Date getBirthday()
    {
        return birthday;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
    @Override
    public String toString()
    {
        return "User [userName=" + userName + ", emailAddress=" + emailAddress
            + ", age=" + age + ", birthday=" + birthday + "]";
    }
    
    
}

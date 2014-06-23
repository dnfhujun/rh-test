package com.oschina.ibatis.bean;

import java.util.Date;
import java.util.List;

public class User
{
    private int t_user_id;
    private String userName;
    private String emailAddress;
    private int age;
    private Date birthday;
    private List<Son> sons;
    
    
    
    public List<Son> getSons()
    {
        return sons;
    }
    public void setSons(List<Son> sons)
    {
        this.sons = sons;
    }
    public int getT_user_id()
    {
        return t_user_id;
    }
    public void setT_user_id(int t_user_id)
    {
        this.t_user_id = t_user_id;
    }
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

/**
* 文件名：User.java
* 创建日期： 2014年5月19日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年5月19日
*   修改人：Administrator
*   修改内容：
*/
package com.oschina.hujun;

import java.util.Date;

/**
 * 功能描述：
 *
 */
public class User
{
    private String userName;
    private String password;
    private Date birthday;
    private int age;
    
    public User(){}
    public User(String userName, String password, Date birthday, int age)
    {
        super();
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "User [userName=" + userName + ", password=" + password
            + ", birthday=" + birthday + ", age=" + age + "]";
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public Date getBirthday()
    {
        return birthday;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
}

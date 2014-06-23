/**
* 文件名：Son.java
* 创建日期： 2014年6月23日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年6月23日
*   修改人：Administrator
*   修改内容：
*/
package com.oschina.ibatis.bean;

/**
 * 功能描述：
 *
 */
public class Son
{
    private String name;
    private int t_son_id;
    private int user_id;
    
    
    public int getUser_id()
    {
        return user_id;
    }
    public void setUser_id(int user_id)
    {
        this.user_id = user_id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getT_son_id()
    {
        return t_son_id;
    }
    public void setT_son_id(int t_son_id)
    {
        this.t_son_id = t_son_id;
    }
    @Override
    public String toString()
    {
        return "Son [name=" + name + ", t_son_id=" + t_son_id + ", user_id="
            + user_id + "]";
    }
    
    
}

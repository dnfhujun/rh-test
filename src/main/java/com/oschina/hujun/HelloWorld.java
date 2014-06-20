package com.oschina.hujun;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;

public class HelloWorld
{
    public static void main(String[] args)
    {
        User user1 = new User("hujun","123456",new Date(),12);
        User user2 = new User();
        try
        {
            BeanUtils.copyProperties(user2, user1);
            System.out.println(user2);
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

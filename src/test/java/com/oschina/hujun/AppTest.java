package com.oschina.hujun;

import java.sql.SQLException;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.oschina.ibatis.bean.User;
import com.oschina.ibatis.dao.UserDao;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws SQLException 
     */
    public void testIbatis() throws SQLException
    {
        UserDao ud = new UserDao();
        User user = new User();
        user.setAge(20);
        user.setBirthday(new Date());
        user.setUserName("jun hu");
        user.setEmailAddress("hellohjboy@139.com");
        int id = ud.insertUser(user);
        System.out.println("id=" + id);
    }
    
    public void testSelect() throws SQLException
    {
        UserDao ud = new UserDao();
        System.out.println(ud.getUserById(2));
    }
}

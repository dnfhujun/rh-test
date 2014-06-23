package com.oschina.hujun;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.beanutils.BeanUtils;

import com.oschina.ibatis.bean.User;
import com.oschina.ibatis.dao.UserDao;

/**
 * Unit test for simple App.
 */
public class UserTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws SQLException 
     */
    public void testInsert() throws SQLException
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
    
    public void testBatchInsert() throws Exception
    {
        UserDao ud = new UserDao();
        User user = new User();
        user.setAge(20);
        user.setBirthday(new Date());
        user.setUserName("jun hu");
        user.setEmailAddress("hellohjboy@139.com");
        User user1 = (User)BeanUtils.cloneBean(user);
        User user2 = (User)BeanUtils.cloneBean(user);
        List<User> users = new ArrayList<User>();
        users.add(user2);
        users.add(user1);
        users.add(user);
        ud.batchInsertUser(users);
    }
    
    public void testGetUserWithSons() throws Exception
    {
        UserDao ud = new UserDao();
        User user = ud.queryUserWithSons(2);
        System.out.println(user.getSons());
    }
}

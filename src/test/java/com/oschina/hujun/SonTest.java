package com.oschina.hujun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.oschina.ibatis.bean.Son;
import com.oschina.ibatis.dao.SonDao;

/**
 * Unit test for simple App.
 */
public class SonTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SonTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SonTest.class );
    }

    
    public void testInsertSon() throws Exception
    {
        SonDao sd = new SonDao();
        Son son = new Son();
        son.setName("chenyu");
        son.setUser_id(2);
        System.out.println(sd.insertSon(son));
    }
}

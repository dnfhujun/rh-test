package com.oschina.ibatis.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.oschina.ibatis.bean.User;

public class UserDao
{
    private static SqlMapClient  sqlMapClient  = null;
    
    static
    {
        try
        {
            Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public User getUserById(long uid) throws SQLException
    {
        return (User)sqlMapClient.queryForObject("user.query_user_by_id", uid);
    }
}

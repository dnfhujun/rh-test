package com.oschina.ibatis.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.oschina.ibatis.bean.User;

public class SqlMapClientFactory
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

    public static SqlMapClient getStance()
    {
        return sqlMapClient;
    }
}

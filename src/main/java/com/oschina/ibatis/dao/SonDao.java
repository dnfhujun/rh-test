package com.oschina.ibatis.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.oschina.ibatis.bean.Son;

public class SonDao
{
    private static SqlMapClient  sqlMapClient  = SqlMapClientFactory.getStance();
    
    /**
     * 插入操作
     * @param son
     * @return
     * @throws SQLException
     */
    public int insertSon(Son son) throws SQLException
    {
        return (Integer)sqlMapClient.insert("son.insert_son", son);
    }
}

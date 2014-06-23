package com.oschina.ibatis.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.oschina.ibatis.bean.User;

public class UserDao
{
    private static SqlMapClient  sqlMapClient  = SqlMapClientFactory.getStance();
    
    public User getUserById(long uid) throws SQLException
    {
        return (User)sqlMapClient.queryForObject("user.query_user_by_id", uid);
    }
    
    public int insertUser(User user) throws SQLException
    {
        return (Integer)sqlMapClient.insert("user.insert_user",user);
    }
    /**
     * 批量插入user
     * @param users
     * @throws SQLException 
     */
    public void batchInsertUser(List<User> users) throws SQLException
    {
        sqlMapClient.startTransaction();
        sqlMapClient.startBatch();
        for(User user : users)
        {
            insertUser(user);
        }
        sqlMapClient.executeBatch();
        sqlMapClient.commitTransaction();
    }
    
    public User queryUserWithSons(int userId) throws SQLException
    {
        return (User)sqlMapClient.queryForObject("user.select_user_with_son",userId);
    }
}

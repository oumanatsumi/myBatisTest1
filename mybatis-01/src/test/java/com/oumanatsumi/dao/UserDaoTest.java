package com.oumanatsumi.dao;

import com.oumanatsumi.pojo.User;
import com.oumanatsumi.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.deleteUser(1);
        System.out.println(i);
        sqlSession.commit();
    }

}

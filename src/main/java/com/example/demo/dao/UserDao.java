package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 根据名称查询用户
     */
    //@Select("SELECT * FROM user WHERE user_name = #{username}")
    public List<User> getUserByName(@Param("username") String username);

    /**
     * 查询所有用户
     */
    //@Select("SELECT * FROM user")
    public List<User> findAllUser();

    /**
     * 新增用户
     */

    /**
     * 修改用户
     */
    //@Update("UPDATE  user SET user_account = #{username},user_pwd = #{password} WHERE id = #{id}")
    void updateUser(@Param("username") String name, @Param("password") String password, @Param("id") String id);

    /**
     * 删除用户
     */
    //@Delete("DELETE from user WHERE id = #{id}")
    void deleteUser(String id);
}

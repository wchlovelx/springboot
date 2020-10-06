package com.example.Mapper;

import com.example.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface UserDao {
    public List<User> findAll();
    public User findById(HashMap map);
    public int deleteById(HashMap map);
    public int insert(HashMap map);
    public int updateById(HashMap map);
}

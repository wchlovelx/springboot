package com.example.Service;

import com.example.Entity.User;
import com.example.Mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserDao userDao;
    public List<User> findAll(){
        List<User> userList = userDao.findAll();
        return userList;
    }
    public User findById(int id){
        HashMap map = new HashMap<>();
        map.put("id",id);
        User user = userDao.findById(map);
        return user;
    }
    public int deleteById(int id){
        HashMap map = new HashMap<>();
        map.put("id",id);
        int i = userDao.deleteById(map);
        return i;
    }
    public int insert(String name,String password,String phone){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        user.setPhone(phone);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("user",user);
        int i = userDao.insert(map);
        return i;
    }
    public int updateById(int id,String username,String password,String phone){
        HashMap<Object, Object> map = new HashMap<>();
        User user = new User();
        user.setId(id);
        user.setPhone(phone);
        user.setPassword(password);
        user.setUsername(username);
        map.put("user",user);
        int i = userDao.updateById(map);
        return i;

    }

}

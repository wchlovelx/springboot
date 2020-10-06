package com.example.Controller;

import com.alibaba.fastjson.JSON;
import com.example.Entity.User;
import com.example.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){
        /*
         * @return java.util.List<com.example.Entity.User>
         * @author liuhong
         * @method
         * @despcription: study make happy,show me the code
         * @date 2020/10/6 16:40
         */
        List<User> userList = userService.findAll();
        return userList;
    }
    @RequestMapping("/findById")
    public String findById(int id){
        /*
         *
         * @param id
         * @return com.example.Entity.User
         * @author liuhong
         * @method
         * @despcription: 加入FastJson是为了测试这个工具，没有额外作用
         * @date 2020/10/6 18:25
         */

        User user = userService.findById(id);
        user.setDate(new Date());
        String s = JSON.toJSONString(user);
        System.out.println(s);
        return s;
    }
    @RequestMapping("/deleteById")
    public int deleteById(int id){
        /*
         *
         * @param id
         * @return int
         * @author liuhong
         * @method
         * @despcription: study make happy,show me the code
         * @date 2020/10/6 18:25
         */

        int i = userService.deleteById(id);
        return i;
    }
    @RequestMapping("/insert")
    public int insert(String username,String password,String phone){
        /*
         *
         * @param username
         * @param password
         * @param phone
         * @return int
         * @author liuhong
         * @method
         * @despcription: study make happy,show me the code
         * @date 2020/10/6 18:25
         */
        int i = userService.insert(username, password, phone);
        return i;
    }
    @RequestMapping("/update")
    public int update(String username,String password,String phone,int id){
        /*
         *
         * @param username
	     * @param password
	     * @param phone
	     * @param id
         * @return int
         * @author liuhong
         * @method
         * @despcription: study make happy,show me the code
         * @date 2020/10/6 18:25
         */
        int i = userService.updateById(id, username, password, phone);
        return i;
    }
}

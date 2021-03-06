package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "按用户名称查询", notes = "按用户名称查询")
    @ApiImplicitParam(name = "username", value = "用户名称", required = true, dataType = "String", paramType = "query")
    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
    public String getUserByName(String username) {
        JSONObject rs = new JSONObject();
        List<User> users = new ArrayList<User>();
        rs.put("code", "200");
        rs.put("msg", "ok");
        rs.put("data", userService.getUserByName("admin"));
        return rs.toJSONString();
    }

    @RequestMapping("/add")
    public void addUser() {
//        User user = new User();
//        String uuid = UUID.randomUUID().toString().replaceAll("-","");
//        user.setId(uuid);
//        user.setUser_name("admin2");
//        user.setUser_age("20");
//        user.setUser_account("admin2");
    }

    @RequestMapping("/update")
    public void updateUser() {
        //User user = userService.findOne();
//        User user = new User();
//        user.setUser_name("admin2");
//        user.setUser_age("20");
//        user.setUser_account("admin2");
    }

    @RequestMapping("/list")
    public List<User> list() {
       // return UserService.getUserList();
        return null;
    }
}

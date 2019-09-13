//package com.example.demo.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.bean.User;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Controller
//@RequestMapping("/jdbc")
//public class JdbcController {
//    @Resource
//    private JdbcTemplate jdbcTemplate;
//
//    @RequestMapping("/userlist")
//    public String getUserList(ModelMap map){
//        String sql = "SELECT * FROM user";
//
//        List<User> userlist = jdbcTemplate.query(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int i) throws SQLException {
//                User user = null;
//                user = new User();
//                user.setId(rs.getString("id"));
//                user.setUser_name(rs.getString("user_name"));
//                user.setUser_sex(rs.getString("user_sex"));
//                user.setUser_age(rs.getString("user_age"));
//                return user;
//            }
//        });
//        for (User user:userlist){
//            System.out.println(user.getUser_name());
//        }
//        //map.addAttribute("users", userlist);
//        //return "users";
//
//        JSONObject result = new JSONObject();
//        result.put("code", "200");
//        result.put("msg", "ok");
//        result.put("data", userlist);
//
//        return result.toJSONString();
//    }
//}

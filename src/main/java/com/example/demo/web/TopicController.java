package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Topic;
import com.example.demo.service.TopicService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public String getAllTopics(HttpServletResponse resp){
        //String jsonString = JSON.toJSONString(topicService.getAllTopic());
        JSONObject result = new JSONObject();
        result.put("code", "200");
        result.put("msg", "ok");
        result.put("data", topicService.getAllTopic());

        return result.toJSONString();
    }

//    public void writeJson(HttpServletResponse resp, JSONPObject json){
//        PrintWriter out = null;
//        try{
//            resp.setContentType("application/json;charset=UTF-8");
//            out = resp.getWriter();
//            out.write(JSON.toJSONString());
//            out.flush();
//        } catch (IOException e){
//            e.printStackTrace();
//        }finally{
//            if(out != null){
//                out.close();
//            }
//        }
//    }
}

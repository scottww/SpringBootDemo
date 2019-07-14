package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Topic;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("课程01","java", "java description"),
                new Topic("课程02","spring boot", "spring boot description"),
                new Topic("课程03","mysql", "mysql description")
        );
    public List<Topic> getAllTopic() {
        return topics;
    }
}

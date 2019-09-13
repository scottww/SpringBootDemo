package com.example.demo.service;

import com.example.demo.bean.Topic;
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

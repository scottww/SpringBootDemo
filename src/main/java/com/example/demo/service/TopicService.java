package com.example.demo.service;

import com.example.demo.domain.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("c01","java", "java description"),
                new Topic("c02","spring boot", "spring boot description"),
                new Topic("c03","mysql", "mysql description")
        );
    public List<Topic> getAllTopic() {
        return topics;
    }
}

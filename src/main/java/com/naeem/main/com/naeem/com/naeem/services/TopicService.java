package com.naeem.main.com.naeem.com.naeem.services;

import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by naeem on 5/24/17.
 */
@Service
public class TopicService {
private List<Topic> topics = Arrays.asList(new Topic("Spring Framework","1","SpringBoot")
        , new Topic("java dependency injection","2","Maven"),
        new Topic("java dependcy injection","3","gradle"));



public List<Topic> getAllTopics(){
    return topics;
}
}

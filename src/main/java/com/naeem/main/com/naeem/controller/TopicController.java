package com.naeem.main.com.naeem.controller;

import com.naeem.main.com.naeem.com.naeem.services.TopicService;
import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by naeem on 5/21/17.
 */
@RestController
public class TopicController {
    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }
}

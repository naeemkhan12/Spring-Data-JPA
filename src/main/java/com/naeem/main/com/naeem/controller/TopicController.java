package com.naeem.main.com.naeem.controller;

import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by naeem on 5/21/17.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return Arrays.asList(new Topic("Spring Framework","1","SpringBoot")
        , new Topic("java dependency injection","2","Maven"),
                new Topic("java dependcy injection","3","gradle"));
    }
}

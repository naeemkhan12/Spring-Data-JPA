package com.naeem.main.com.naeem.controller;

import com.naeem.main.com.naeem.com.naeem.services.TopicService;
import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
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
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
       return topicService.getTopic(id);
    }
    @RequestMapping(method=RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }
    @RequestMapping(method=RequestMethod.PUT,value = "/topics/{id}")
    public void addTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(id,topic);

    }
    @RequestMapping(method=RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);


    }
}

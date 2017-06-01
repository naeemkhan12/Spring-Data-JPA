package com.naeem.main.com.naeem.com.naeem.services;

import com.naeem.main.com.naeem.topics.Topic;
import com.naeem.main.com.naeem.topics.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by naeem on 5/24/17.
 */
@Service
public class TopicService {
    @Autowired
    private TopicsRepository topicsRepository;


/*
private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("Spring Framework","1","SpringBoot")
        , new Topic("java dependency injection","2","Maven"),
        new Topic("java dependcy injection","3","gradle"))) ;
*/



    public List<Topic> getAllTopics()
    {
//    return topics;
        List<Topic> topics = new ArrayList<>();
        topicsRepository.findAll().forEach(topics::add);
        return  topics;

    }
    public Topic getTopic(String id){
        return topicsRepository.findOne(id);

//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic){

//        topics.add(topic);
        topicsRepository.save(topic);
    }
    public void updateTopic(String id , Topic topic){
/*
        for(Topic top: topics){
            if(top.getId().equals(id)){
                topics.set(topics.indexOf(top),topic);
                break;
            }

        }
 */
        topicsRepository.save(topic);
    }
    public void deleteTopic(String id)
    {
        topicsRepository.delete(id);
//        topics.removeIf(topic -> topic.getId().equals(id));
    }
}


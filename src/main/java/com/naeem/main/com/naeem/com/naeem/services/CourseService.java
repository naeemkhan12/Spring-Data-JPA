package com.naeem.main.com.naeem.com.naeem.services;

import com.naeem.main.com.naeem.com.naeem.courses.Course;
import com.naeem.main.com.naeem.com.naeem.courses.CourseRepository;
import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naeem on 6/1/17.
 */
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String courseId)
    {
//    return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(courseId).forEach(courses::add);
        return  courses;

    }
    public Course getCourse(String id){
        return courseRepository.findOne(id);

//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    public void addCourse(Course course ){

//        topics.add(topic);
        courseRepository.save(course);
    }
    public void updateCourse(Course course){
/*
        for(Topic top: topics){
            if(top.getId().equals(id)){
                topics.set(topics.indexOf(top),topic);
                break;
            }

        }
 */
        courseRepository.save(course);
    }
    public void deleteCourse(String id)
    {
        courseRepository.delete(id);
//        topics.removeIf(topic -> topic.getId().equals(id));
    }
}

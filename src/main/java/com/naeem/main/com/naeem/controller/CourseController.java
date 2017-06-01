package com.naeem.main.com.naeem.controller;
import com.naeem.main.com.naeem.com.naeem.courses.Course;
import com.naeem.main.com.naeem.com.naeem.services.CourseService;
import com.naeem.main.com.*;
import com.naeem.main.com.naeem.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by naeem on 6/1/17.
 */
import com.naeem.*;
public class CourseController {
    @Autowired
    CourseService CourseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> geAllCourses(@PathVariable String id){
        return CourseService.getAllCourses(id);
    }
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return CourseService.getCourse(id);
    }
    @RequestMapping(method= RequestMethod.POST,value = "/topics/{topicId}/courses/{id}")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        CourseService.addCourse(course);

    }
    @RequestMapping(method=RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        CourseService.updateCourse(course);

    }
    @RequestMapping(method=RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        CourseService.deleteCourse(id);


    }
}

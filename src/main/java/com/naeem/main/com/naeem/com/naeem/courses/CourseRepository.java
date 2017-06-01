package com.naeem.main.com.naeem.com.naeem.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by naeem on 6/1/17.
 */
public interface CourseRepository  extends CrudRepository<Course,String>{

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String description);
    public List<Course> findByTopicId(String topicId);


}

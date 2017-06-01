package com.naeem.main.com.naeem.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by naeem on 5/21/17.
 */
@Entity
public class Topic {
    @Id
    private String description;
    private String id;
    private String name;

    public Topic(String description, String id, String name) {
        this.description = description;
        this.id = id;
        this.name = name;
    }
    public Topic(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

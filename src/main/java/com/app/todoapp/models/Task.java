package com.app.todoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity             // creates a table in the DB automatically with the fields as per the attributes of the class
@Data
public class Task {

    @Id             // id field of object, unique value, primary key
    @GeneratedValue(strategy = GenerationType.AUTO)             // generates a values automatically on creation, no need to do manually
    private Long id;
    private String name;
    private Boolean completed;

}

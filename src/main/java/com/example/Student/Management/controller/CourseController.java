package com.example.Student.Management.controller;

import com.example.Student.Management.model.Book;
import com.example.Student.Management.model.Course;
import com.example.Student.Management.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    //add course
    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    //get course by id
    @GetMapping("course/id/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }


    //delete course by id
    @DeleteMapping ("course/id/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }


    //update course
    @PutMapping("course")
    public String updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}

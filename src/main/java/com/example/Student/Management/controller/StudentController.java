package com.example.Student.Management.controller;

import com.example.Student.Management.model.Laptop;
import com.example.Student.Management.model.Student;
import com.example.Student.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //add student
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    //get student by
    @GetMapping("student/id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }


    //delete student by id
    @DeleteMapping ("student/id/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }


    //update student
    @PutMapping("student")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}

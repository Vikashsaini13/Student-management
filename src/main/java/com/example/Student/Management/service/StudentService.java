package com.example.Student.Management.service;

import com.example.Student.Management.model.Laptop;
import com.example.Student.Management.model.Student;
import com.example.Student.Management.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student added";
    }

    public Student getStudentById(Long id) {

        return studentRepo.findById(id).get();
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);
        return "student deleted";
    }

    public String updateStudent(Student student) {

        Student existingStudent =studentRepo.findById(student.getStudentId()).get();

        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setStudentAge(student.getStudentAge());
        existingStudent.setStudentPhoneNo(student.getStudentPhoneNo());
        existingStudent.setStudentBranch(student.getStudentBranch());
        studentRepo.save(existingStudent);

        return "laptop updated successfully!!!!";

    }
}

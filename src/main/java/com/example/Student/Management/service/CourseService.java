package com.example.Student.Management.service;

import com.example.Student.Management.model.Book;
import com.example.Student.Management.model.Course;
import com.example.Student.Management.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "Course saved";
    }

    public Course getCourseById(Long id) {
        Optional<Course> course=courseRepo.findById(id);
        return course.get();
    }

    public String deleteCourseById(Long id) {
        courseRepo.deleteById(id);
        return "course deleted";
    }

    public String updateCourse(Course course) {
        Course existingCourse =courseRepo.findById(course.getCourseId()).get();

        existingCourse.setCourseTitle(course.getCourseTitle());
        existingCourse.setCourseDescription(course.getCourseDescription());
        existingCourse.setCourseDuration(course.getCourseDuration());

        courseRepo.save(existingCourse);

        return "course updated successfully!!!!";

    }
}

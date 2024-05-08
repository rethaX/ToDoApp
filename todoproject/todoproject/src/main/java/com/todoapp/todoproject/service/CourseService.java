package com.todoapp.todoproject.service;

import com.todoapp.todoproject.entity.Course;
import com.todoapp.todoproject.repositories.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    //POST
    public Course saveCourse(Course course) {
        System.out.println(course.toString());
        return courseRepo.save(course);
    }

    //Optional!
    public List<Course> saveCourses(List<Course> courses) {
        return courseRepo.saveAll(courses);
    }

    //GET
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }
    public Course getCourseById(int id) {
        return courseRepo.findById(id).orElse(null);
    }
    public Course getCourseByName(String name) {
        return courseRepo.findByName(name);
    }
    public List<Course> getCoursesForUser(String username) {
        return courseRepo.findAllByUsername(username);
    }

    //PUT
    public Course updateCourse(Course course) {
        System.out.println("updates");
        Course existing_course = courseRepo.findById(course.getId()).orElse(null);
        existing_course.setName(course.getName());
        existing_course.setDescription(course.getDescription());
        existing_course.setStatus(course.getStatus());
        return courseRepo.save(existing_course);
    }

    //DELETE
    public String deleteCourse(int id) {
        courseRepo.deleteById(id);
        return id + " id -> course removed/completed";
    }

}
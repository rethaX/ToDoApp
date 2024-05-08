package com.todoapp.todoproject.repositories;

import com.todoapp.todoproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

    Course findByName(String name);

    List<Course> findAllByUsername(String username);
}
package com.todoapp.todoproject.repositories;


import com.todoapp.todoproject.entity.Course;
import com.todoapp.todoproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);

    User findTopByUsername(String username);

    User findTopByPassword(String password);

}
package com.example.mvc_demo.repos;

import com.example.mvc_demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}

package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    public List<User> findUserByNameStartsWith(String id);

    public User deleteUserById(String id);

}



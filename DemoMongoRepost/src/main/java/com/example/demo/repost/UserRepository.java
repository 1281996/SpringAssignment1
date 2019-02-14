package com.example.demo.repost;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}

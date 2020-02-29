package com.azad.practice.userregbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.azad.practice.userregbackend.entity.User;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface UserRepository extends CrudRepository<User, Long> {

}

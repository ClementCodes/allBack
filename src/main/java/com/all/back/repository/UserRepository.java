package com.all.back.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.all.back.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

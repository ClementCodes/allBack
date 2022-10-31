package com.all.back.backUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.all.back.backUser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

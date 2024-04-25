package com.api.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  public static User findByEmail(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
  }

}

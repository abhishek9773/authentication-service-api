package com.api.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.userservice.config.JwtProvider;
import com.api.userservice.model.User;
import com.api.userservice.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User getUserProfile(String jwt) {
    String email = JwtProvider.getEmailFromJwtToken(jwt);
    return UserRepository.findByEmail(email);
  }

}

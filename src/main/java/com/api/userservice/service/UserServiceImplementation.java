package com.api.userservice.service;

import java.util.List;

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

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserProfile() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUserProfile'");
  }

}

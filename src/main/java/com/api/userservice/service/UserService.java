package com.api.userservice.service;

import java.util.List;

import com.api.userservice.model.User;

public interface UserService {

  public User getUserProfile();

  public List<User> getAllUsers();

  public User getUserProfile(String jwt);

}
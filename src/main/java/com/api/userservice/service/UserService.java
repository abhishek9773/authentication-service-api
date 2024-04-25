package com.api.userservice.service;

import com.api.userservice.model.User;

public interface UserService {

  public User getUserProfile(String jwt);

}
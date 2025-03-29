package com.FanFic.blog.services;

import com.FanFic.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}

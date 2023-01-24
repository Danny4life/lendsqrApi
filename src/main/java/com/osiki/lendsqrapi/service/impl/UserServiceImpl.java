package com.osiki.lendsqrapi.service.impl;

import com.osiki.lendsqrapi.repository.UserRepository;
import com.osiki.lendsqrapi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

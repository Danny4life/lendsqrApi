package com.osiki.lendsqrapi.service;

import com.osiki.lendsqrapi.model.UserDetails;

import java.util.List;

public interface UserDetailsService {
    UserDetails createUserDetails(UserDetails userDetails);

    List<UserDetails> getUserInformation();
}

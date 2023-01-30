package com.osiki.lendsqrapi.service.impl;

import com.osiki.lendsqrapi.entity.UserDetailsEntity;
import com.osiki.lendsqrapi.model.UserDetails;
import com.osiki.lendsqrapi.repository.UserDetailsRepository;
import com.osiki.lendsqrapi.service.UserDetailsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDetailsRepository userDetailsRepository;

    public UserDetailsServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetails createUserDetails(UserDetails userDetails) {

        UserDetailsEntity userDetailsEntity = new UserDetailsEntity();

        BeanUtils.copyProperties(userDetails, userDetailsEntity);
        userDetailsRepository.save(userDetailsEntity);

        return userDetails;
    }

    @Override
    public List<UserDetails> getUserInformation() {

        List<UserDetailsEntity> userDetailsEntities = userDetailsRepository.findAll();

        List<UserDetails> userDetails = userDetailsEntities
                .stream()
                .map(user -> new UserDetails(
                       user.getId(),
                        user.getFullName(),
                        user.getPhoneNumber(),
                        user.getEmailAdd(),
                        user.getBvn(),
                        user.getType_of_residence(),
                        user.getGender(),
                        user.getMaritalStatus(),
                        user.getChildren()))
                .collect(Collectors.toList());
        return userDetails;
    }
}

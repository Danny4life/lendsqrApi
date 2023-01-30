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

    @Override
    public UserDetails getUserInformationById(Long id) {

       UserDetailsEntity userDetailsEntity =
               userDetailsRepository.findById(id).get();

       UserDetails userDetails = new UserDetails();
       BeanUtils.copyProperties(userDetailsEntity, userDetails);

        return userDetails;
    }

    @Override
    public UserDetails updateUser(Long id, UserDetails userDetails) {

        UserDetailsEntity userDetailsEntity =
                userDetailsRepository.findById(id).get();

        userDetailsEntity.setFullName(userDetails.getFullName());
        userDetailsEntity.setPhoneNumber(userDetails.getPhoneNumber());
        userDetailsEntity.setEmailAdd(userDetails.getEmailAdd());
        userDetailsEntity.setBvn(userDetails.getBvn());
        userDetailsEntity.setType_of_residence(userDetails.getType_of_residence());
        userDetailsEntity.setGender(userDetails.getGender());
        userDetailsEntity.setMaritalStatus(userDetails.getMaritalStatus());
        userDetailsEntity.setChildren(userDetails.getChildren());

        userDetailsRepository.save(userDetailsEntity);
        return userDetails;
    }
}

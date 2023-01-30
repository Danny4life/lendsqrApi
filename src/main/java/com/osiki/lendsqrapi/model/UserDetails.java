package com.osiki.lendsqrapi.model;

import com.osiki.lendsqrapi.enums.Children;
import com.osiki.lendsqrapi.enums.Gender;
import com.osiki.lendsqrapi.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    private long id;
    private String fullName;
    private String phoneNumber;
    private String emailAdd;
    private String bvn;
    private String type_of_residence;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Children children;

//    public UserDetails(long id, String fullName, String phoneNumber, String emailAdd, String bvn, String type_of_residence, Gender gender, MaritalStatus maritalStatus, Children children) {
//    }
//    private String gender;
//    private String maritalStatus;
//    private String children;


}

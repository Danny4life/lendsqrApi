package com.osiki.lendsqrapi.entity;

import javax.persistence.*;

import com.osiki.lendsqrapi.enums.Children;
import com.osiki.lendsqrapi.enums.Gender;
import com.osiki.lendsqrapi.enums.MaritalStatus;
import com.osiki.lendsqrapi.model.Base;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details_tbl")
public class UserDetailsEntity extends Base {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    private long id;

    private String fullName;
    private String phoneNumber;
    private String emailAdd;
    private String bvn;
    private String type_of_residence;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Children children;

//    private String gender;
//    private String maritalStatus;
//    private String children;



}

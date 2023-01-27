package com.osiki.lendsqrapi.entity;

import javax.persistence.*;

import com.osiki.lendsqrapi.enums.Children;
import com.osiki.lendsqrapi.enums.Gender;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details_tbl")
public class UserDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String fullName;
    private String phoneNumber;
    private String emailAdd;
    private String bvn;
    private Gender gender;
    private Children children;
    private String type_of_residence;


}

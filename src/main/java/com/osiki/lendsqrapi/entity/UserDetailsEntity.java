package com.osiki.lendsqrapi.entity;

import javax.persistence.*;

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


}

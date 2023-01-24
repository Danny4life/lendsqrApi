package com.osiki.lendsqrapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    long id;
    String email;
    String password;

}

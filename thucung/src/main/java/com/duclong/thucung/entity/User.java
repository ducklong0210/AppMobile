package com.duclong.thucung.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "name")
    String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    Date date;

    @Column(name = "isAdmin")
    int isAdmin;

    @Column(name = "number")
    String number;
}

package com.duclong.thucung.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Getter
@Setter
public class NewUserRequest {
     int id;
     String email;
     String password;
     String name;
     Date date;
     int isAdmin;
     String number;

}

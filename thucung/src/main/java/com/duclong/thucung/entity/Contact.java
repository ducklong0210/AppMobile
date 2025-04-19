//package com.duclong.thucung.entity;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//import lombok.experimental.FieldNameConstants;
//
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "contact")
//
//@Entity
//public class Contact {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int idContact;
//    @Column(name = "id")
//    int id;
//
//    @Column(name = "name")
//    String name;
//    @Column(name = "email")
//    String email;
//    @Column(name = "title")
//    String title;
//    @Column(name = "content")
//    String content;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd/MM/yyyy")
//    LocalDate date;
//
//}

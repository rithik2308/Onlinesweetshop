package com.capgemini.onlinesweetshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tableuser")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @Column(name="UserId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name="FirstName")
    private String firstname;
    @Column(name="LastName")
    private String lastname;
    @Column(name="Address")
    private String address;
    @Column(name="PhoneNumber")
    private String phonenumber;
}
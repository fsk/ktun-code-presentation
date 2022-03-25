package com.ktun.crudapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "student_name", length = 50)
    private String name;

    @Column(name = "student_surname", length = 50)
    private String surname;

    @Column(name = "student_tc", length = 11, unique = true, nullable = false)
    private String identityNumber;

    @Column(name = "student_email", unique = true)
    private String email;

    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}

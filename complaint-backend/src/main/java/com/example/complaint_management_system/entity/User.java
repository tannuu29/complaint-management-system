package com.example.complaint_management_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String username;

    @Column(nullable = false)
    private String mobile;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    @Enumerated()
    private Role role;

    private boolean active;
}

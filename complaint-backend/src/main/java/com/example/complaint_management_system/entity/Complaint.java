package com.example.complaint_management_system.entity;

import com.example.complaint_management_system.enums.ComplaintStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(unique = true, nullable = false)
    private String complaintNumber;

    @Column(nullable = false, length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private ComplaintStatus status;

    /* Logged-in user */
    @ManyToOne
    @JoinColumn(name = "created_by")  //for complainant
    private User createdBy;  //null for guest complaints

    /* Guest user details */
    private String guestName;
    private String guestEmail;
    private String guestMobile;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;   //staff


    private LocalDateTime createdAt;

}

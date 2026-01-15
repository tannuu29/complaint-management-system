package com.example.complaint_management_system.dto;

import com.example.complaint_management_system.entity.User;
import com.example.complaint_management_system.enums.ComplaintStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ComplaintResDto {
    private String id;
    private String complaintNumber;
    private String description;
    private ComplaintStatus status;
    private User createdBy;
    private LocalDateTime createdAt;
}

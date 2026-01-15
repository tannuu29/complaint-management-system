package com.example.complaint_management_system.dto;

import lombok.Data;

@Data
public class ComplaintReqDto {
    private String description;
    private Long department_id;

    /* Only required if user is NOT logged in */
    private String guestName;
    private String guestEmail;
    private String guestMobile;
}

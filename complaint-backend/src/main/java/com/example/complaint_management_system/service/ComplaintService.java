package com.example.complaint_management_system.service;

import com.example.complaint_management_system.repository.ComplaintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepo complaintRepo;

}

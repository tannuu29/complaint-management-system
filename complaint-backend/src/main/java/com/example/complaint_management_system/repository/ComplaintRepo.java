package com.example.complaint_management_system.repository;

import com.example.complaint_management_system.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepo extends JpaRepository<Complaint, Long> {
}

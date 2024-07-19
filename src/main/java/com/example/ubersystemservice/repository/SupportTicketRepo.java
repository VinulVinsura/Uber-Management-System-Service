package com.example.ubersystemservice.repository;

import com.example.ubersystemservice.entity.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupportTicketRepo extends JpaRepository<SupportTicket, Integer> {
    List<SupportTicket> findByUserId(String userId);
}

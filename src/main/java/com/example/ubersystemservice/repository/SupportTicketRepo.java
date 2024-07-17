package com.example.ubersystemservice.repository;

import com.example.ubersystemservice.entity.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportTicketRepo extends JpaRepository<SupportTicket, Integer> {
}

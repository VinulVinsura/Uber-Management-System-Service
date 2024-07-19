package com.example.ubersystemservice.service;

import com.example.ubersystemservice.dto.SupportTicketsDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserSupportService {
    SupportTicketsDto postSupportTicket(SupportTicketsDto ticketsDto);
    List<SupportTicketsDto> getSupportTickets(String userId);

}

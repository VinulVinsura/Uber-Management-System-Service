package com.example.ubersystemservice.service;

import com.example.ubersystemservice.dto.SupportTicketsDto;
import org.springframework.stereotype.Service;
public interface UserSupportService {
    SupportTicketsDto postSupportTicket(SupportTicketsDto ticketsDto);

}

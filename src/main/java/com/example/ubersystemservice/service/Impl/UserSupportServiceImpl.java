package com.example.ubersystemservice.service.Impl;

import com.example.ubersystemservice.dto.SupportTicketsDto;
import com.example.ubersystemservice.entity.SupportTicket;
import com.example.ubersystemservice.repository.SupportTicketRepo;
import com.example.ubersystemservice.service.UserSupportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSupportServiceImpl implements UserSupportService {
    private final SupportTicketRepo supportTicketRepo;
    private final ModelMapper modelMapper;

    @Override
    public SupportTicketsDto postSupportTicket(SupportTicketsDto ticketsDto) {
        SupportTicket supportTicket=new SupportTicket();
        supportTicket.setPostDate(new Date());
        supportTicket.setDescription(ticketsDto.getDescription());
        supportTicket.setUserId(ticketsDto.getUserId());
        supportTicket.setUserName(ticketsDto.getUserName());
        supportTicket.setEmail(ticketsDto.getEmail());
        supportTicket.setPhoneNumber(ticketsDto.getPhoneNumber());
        supportTicket.setUserRole(ticketsDto.getUserRole());
        SupportTicket ticket = supportTicketRepo.save(supportTicket);
        return modelMapper.map(ticket, SupportTicketsDto.class);
    }

    @Override
    public List<SupportTicketsDto> getSupportTickets(String userId) {
        List<SupportTicket> ticketList = supportTicketRepo.findByUserId(userId);
        return modelMapper.map(ticketList,new TypeToken<List<SupportTicketsDto>>(){}.getType());
    }
}

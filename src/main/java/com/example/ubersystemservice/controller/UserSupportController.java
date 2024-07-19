package com.example.ubersystemservice.controller;

import com.example.ubersystemservice.dto.SupportTicketsDto;
import com.example.ubersystemservice.service.UserSupportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UserSupportController {
    private final UserSupportService userSupportService;

    @PostMapping("/post/support-ticket")
    public ResponseEntity<SupportTicketsDto> postSupportTicket(@RequestBody SupportTicketsDto dto){
        SupportTicketsDto ticketsDto = userSupportService.postSupportTicket(dto);
        return ResponseEntity.ok(ticketsDto);
    }

    @GetMapping("/get-support-ticket/{userId}")
    public ResponseEntity<List<SupportTicketsDto>> getSupportTicketById(@PathVariable String userId){
        List<SupportTicketsDto> ticketsDtoList = userSupportService.getSupportTickets(userId);
        if (ticketsDtoList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ticketsDtoList);

    }
}

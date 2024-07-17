package com.example.ubersystemservice.controller;

import com.example.ubersystemservice.dto.SupportTicketsDto;
import com.example.ubersystemservice.service.UserSupportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

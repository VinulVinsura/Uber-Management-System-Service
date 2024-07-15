package com.example.ubersystemservice.controller;

import com.example.ubersystemservice.dto.NotificationDto;
import com.example.ubersystemservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    //The notification is posted by the system
    @PostMapping("/post-notification")
    public ResponseEntity<NotificationDto> postNotification(@RequestBody NotificationDto dto){
        NotificationDto notificationDto = notificationService.postNotification(dto);
        return ResponseEntity.ok(notificationDto);
    }
}

package com.example.ubersystemservice.service.Impl;

import com.example.ubersystemservice.dto.NotificationDto;
import com.example.ubersystemservice.entity.Notification;
import com.example.ubersystemservice.repository.NotificationRepo;
import com.example.ubersystemservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepo notificationRepo;
    private final ModelMapper modelMapper;
    @Override
    public NotificationDto postNotification(NotificationDto dto) {
        Notification notification=new Notification();
        notification.setPostDate(new Date());
        notification.setDescription(dto.getDescription());
        Notification savedNotification = notificationRepo.save(notification);
        return modelMapper.map(savedNotification, NotificationDto.class);
    }
}

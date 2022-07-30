package com.dpaula.notification.service;

import com.dpaula.notification.controller.NotificationRequest;
import com.dpaula.notification.entity.Notification;
import com.dpaula.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record NotificationService(NotificationRepository repository) {
    public void send(NotificationRequest request) {
        final var notification = Notification.builder()
                .toCustomerId(request.toCustomerId())
                .toCustomerEmail(request.toCustomerEmail())
                .sender("dpaula")
                .message(request.message())
                .sentAt(LocalDateTime.now())
                .build();

        repository.save(notification);
    }
}

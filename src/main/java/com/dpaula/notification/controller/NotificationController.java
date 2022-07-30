package com.dpaula.notification.controller;

import com.dpaula.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fernando de Lima on 29/07/22
 */
@Slf4j
@RestController
@RequestMapping("api/v1/notification")
public record NotificationController(NotificationService service) {

    @PostMapping
    public void sendNotification(@RequestBody NotificationRequest request) {
        log.info("Sending notification {}", request);

        service.send(request);
    }
}

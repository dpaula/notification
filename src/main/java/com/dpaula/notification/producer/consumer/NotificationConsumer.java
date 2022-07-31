package com.dpaula.notification.producer.consumer;

import com.dpaula.notification.controller.NotificationRequest;
import com.dpaula.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Fernando de Lima on 30/07/22
 */
@Slf4j
@Component
public record NotificationConsumer(NotificationService service) {

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consume(final NotificationRequest request) {
        log.info("Consuming notification {}", request);
        service.send(request);
    }
}

package com.dpaula.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer,
//                                         RabbitMQConfigProperties config) {
//        return args -> {
//            System.out.println("Hello World!");
//            producer.publish(new Person("Fernando", 36), config.getInternalExchange(), config.getInternalNotificationRoutingKey());
//        };
//    }
//
//    record Person(String name, int age){}

}

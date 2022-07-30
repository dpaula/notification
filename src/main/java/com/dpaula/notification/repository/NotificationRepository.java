package com.dpaula.notification.repository;

import com.dpaula.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fernando de Lima on 30/07/22
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}

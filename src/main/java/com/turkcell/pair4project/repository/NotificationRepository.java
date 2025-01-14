package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}

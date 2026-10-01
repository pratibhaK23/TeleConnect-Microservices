package com.pkslearning.support_service.entity;

import java.time.LocalDateTime;

import com.pkslearning.support_service.enums.SenderType;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class TicketComment {

	
	private long id;
	private Ticket ticket;
	private long senderId;
	private SenderType senderType;
	private String message;
	private LocalDateTime createdAt;
}

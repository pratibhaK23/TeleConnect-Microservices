package com.pkslearning.notification.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Notification {
	@Id
	@GeneratedValue
	private UUID notificationId;
	
	@Column(name="order_id")
	private UUID orderId;
	
	@Column(name="payment_id")
	private UUID paymentId ;
	
	@Column(name="customer_id")
	private UUID customerId;

	@Enumerated(EnumType.STRING)
	private NotifyChannel channel;
	
	@Enumerated(EnumType.STRING)
	private MessageType messageType; 
	
	@Column(name="message_content")
	private String messageContent;
	
	@Enumerated(EnumType.STRING)
	Status status;

	@Column(name="retry_count")
    private Integer retryCount;
	
	@Column(name="provider_response")
	private String providerResponse;

	
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;
	
    @CreationTimestamp
    @Column(name = "sent_at", updatable = false)
    private Instant sentAt;
	
}

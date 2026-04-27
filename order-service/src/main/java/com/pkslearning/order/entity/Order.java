package com.pkslearning.order.entity;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue
	private UUID orderId;
	

	private UUID customerId;

	private UUID planId;

	private String planNameSnapshot;

	private BigDecimal priceSnapshot;

	private Integer validitySnapshot;

	@Enumerated(EnumType.STRING)
	@Column(name="order_status")
	OrderStatus orderStatus;

	@CreationTimestamp
	@Column(name="created_at")
	private Instant createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Instant updatedAt;
}

package com.pkslearning.plan.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Plan {

	@Id
	@GeneratedValue
	@Column(name="plan_id")
	private UUID planId;
	
	@Column(name="plan_name")
	private String planName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="plan_type")
	private PlanType planType;
	
	@Column(name="description")
	private String description;
	
	@Column(name="validity")
	private long validity;
	
	@Column(name="data_limit")
	private long dataLimit;
	
	@Column(name="voice_limit")
	private long voiceLimit;
	
	@Column(name="sms_limit")
	private long smsLimit;
	
	@Column(name="price")
	private double price;
	
	@Column(name="isActive")
	private boolean isActive;

	@Column(name="createdAt")
	private LocalDate createdAt=LocalDate.now();

	@Column(name="updatedAt")
    private LocalDate updatedAt=LocalDate.now();
}

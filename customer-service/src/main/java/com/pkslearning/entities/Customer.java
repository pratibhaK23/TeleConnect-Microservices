package com.pkslearning.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private UUID customerID ;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="id_proof_type")
	private String idProofType ;
	
	@Column(name="id_proof_number")
	private String idProofNumber;
	
	@Column(name="password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="kycStatus")
	private KycStatus kyc;
	
	@Enumerated(EnumType.STRING)
	@Column(name="account_status")
	private AccountStatus status;
	
	@Column(name="registration_date")
	private LocalDate registrationDate = LocalDate.now();
	

}
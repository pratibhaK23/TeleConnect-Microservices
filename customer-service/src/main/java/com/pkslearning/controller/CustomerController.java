package com.pkslearning.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkslearning.dto.CreateCustomerRequest;
import com.pkslearning.dto.CustomerResponse;
import com.pkslearning.entities.Customer;
import com.pkslearning.service.CustomerService;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

	
	private final CustomerService customerService;
	
	
	public CustomerController(CustomerService customerService)
	{
		this.customerService=customerService;
	}
	
	@PostMapping
	public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CreateCustomerRequest createCustomer)
	{
		return new ResponseEntity<>(customerService.createCustomer(createCustomer), HttpStatus.CREATED);
	}
	
	@GetMapping("{/id}")
	public ResponseEntity<CustomerResponse> getCustomer(@PathVariable UUID id)
	{
		return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>>  getAllCustomers()
	{
		return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
	}
}

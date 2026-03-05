package com.pkslearning.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.pkslearning.dto.CreateCustomerRequest;
import com.pkslearning.dto.CustomerResponse;
import com.pkslearning.entities.Customer;
import com.pkslearning.mapper.CustomerMapper;
import com.pkslearning.repository.CustomerRepository;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository)
	{
		this.customerRepository=customerRepository;
	}
	
	  
	public CustomerResponse createCustomer(CreateCustomerRequest request) 
	{
		if(customerRepository.findByEmail(request.getEmail()).isPresent())
				{
					 throw new  RuntimeException ("This email already exists");
				}
		
			Customer customer=CustomerMapper.toEntity(request);
			Customer savedCustomer=customerRepository.save(customer);;
			return CustomerMapper.toResponse(savedCustomer);
	
			
	}


	public CustomerResponse getCustomer(UUID id) {
		// TODO Auto-generated method stub
		
			Customer customer=customerRepository.findById(id).orElseThrow();
			 
		return CustomerMapper.toResponse(customer);
	}


	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customer=customerRepository.findAll();
		return customer;
	}
}

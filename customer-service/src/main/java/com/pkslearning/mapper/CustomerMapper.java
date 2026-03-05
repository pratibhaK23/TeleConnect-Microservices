package com.pkslearning.mapper;

import com.pkslearning.dto.CreateCustomerRequest;
import com.pkslearning.dto.CustomerResponse;
import com.pkslearning.entities.Customer;

public class CustomerMapper {

	public static Customer toEntity(CreateCustomerRequest request)
	{
		Customer customer=new Customer();
		
		customer.setFirstName(request.getFirstName());
		customer.setLastName(request.getLastName());
		customer.setEmail(request.getEmail());
		customer.setPhone(request.getPhone());
		customer.setAddress(request.getAddress());
		customer.setDateOfBirth(request.getDateOfBirth());
		customer.setIdProofType(request.getIdProofType());
		customer.setIdProofNumber(request.getIdProofNumber());
		
		return customer;

	
	}
	
	
	 public static CustomerResponse toResponse(Customer customer) {
	        CustomerResponse response = new CustomerResponse();
	        response.setFirstName(customer.getFirstName());
	        response.setLastName(customer.getLastName());
	        customer.setEmail(customer.getEmail());
	        response.setPhone(customer.getPhone());
	        response.setAddress(customer.getAddress());
	        response.setDateOfBirth(customer.getDateOfBirth());
	        response.setIdProofType(customer.getIdProofType());
	        response.setIdProofNumber(customer.getIdProofNumber());
	        return response;
	    }
}

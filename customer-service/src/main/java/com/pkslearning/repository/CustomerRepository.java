package com.pkslearning.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkslearning.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,UUID> {

	//@Query(value="Select *from customer where email = ? email", nativeQuery = true)
	Optional<Customer> findByEmail(String email);

}

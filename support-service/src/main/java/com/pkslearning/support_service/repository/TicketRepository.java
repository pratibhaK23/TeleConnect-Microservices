package com.pkslearning.support_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkslearning.support_service.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{

}

package com.pkslearning.support_service.service;

import java.util.List;
import java.util.Optional;

import com.pkslearning.support_service.dto.TicketResponseDto;
import com.pkslearning.support_service.entity.Ticket;
import com.pkslearning.support_service.mapper.TicketMapper;
import com.pkslearning.support_service.repository.TicketRepository;

public class TicketServiceImpl implements TicketService {

	private final TicketRepository ticketRepository;


	TicketServiceImpl(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}
	
	
	public List<TicketResponseDto> fetchAllTicket() {
		
		List<Ticket> result=ticketRepository.findAll();
		return result.stream()
				.map(TicketMapper::EntityToDto)
				.toList();
	}

	public Optional<TicketResponseDto> fetchTicket(long id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id)
				.map(TicketMapper::EntityToDto);
		
		
		
	}

}


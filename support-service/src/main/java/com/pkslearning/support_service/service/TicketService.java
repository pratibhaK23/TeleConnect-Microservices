package com.pkslearning.support_service.service;

import java.util.List;
import java.util.Optional;

import com.pkslearning.support_service.dto.TicketResponseDto;

public interface TicketService {

	public List<TicketResponseDto> fetchAllTicket();
	public Optional<TicketResponseDto> fetchTicket(long id);
}

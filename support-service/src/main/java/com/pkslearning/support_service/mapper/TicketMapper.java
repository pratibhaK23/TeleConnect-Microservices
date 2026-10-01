package com.pkslearning.support_service.mapper;

import java.time.LocalDateTime;

import com.pkslearning.support_service.dto.TicketRequestDto;
import com.pkslearning.support_service.dto.TicketResponseDto;
import com.pkslearning.support_service.entity.Ticket;

public class TicketMapper {
	
	public static Ticket dtoToEntity(TicketRequestDto dto)
	{
		if(dto==null)
		{
			return null;
		}
		
		Ticket ticket=new Ticket();
		
			ticket.setCustomerId(dto.getCustomerId());
			ticket.setCategory(dto.getCategory());
			ticket.setDescription(dto.getDescription());
			ticket.setPriority(dto.getPriority());
			ticket.setSubject(dto.getSubject());
			
			ticket.setStatus("OPEN");
			ticket.setCreatedDate(LocalDateTime.now());
			ticket.setUpdatedDate(LocalDateTime.now());
			
			return ticket;
	}

	public static TicketResponseDto EntityToDto(Ticket ticket)
	{
		TicketResponseDto dto=new TicketResponseDto();
		
		 dto.setTicketNumber(ticket.getTicketNumber());
	        dto.setCustomerId(ticket.getCustomerId());
	        dto.setSubject(ticket.getSubject());
	        dto.setDescription(ticket.getDescription());
	        dto.setCategory(ticket.getCategory());
	        dto.setPriority(ticket.getPriority());
	        dto.setStatus(ticket.getStatus());
	        dto.setAssignedAgentId(ticket.getAssignedAgentId());
	        dto.setCreatedDate(ticket.getCreatedDate());
	        dto.setUpdatedDate(ticket.getUpdatedDate());
		
		return dto;
	}
}

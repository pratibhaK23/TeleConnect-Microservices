package  com.pkslearning.support_service.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkslearning.support_service.dto.TicketResponseDto;
import com.pkslearning.support_service.service.TicketService;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController{

    private final TicketService ticketService;

    public TicketController(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }
@GetMapping("/getAll")
    public ResponseEntity<List<TicketResponseDto>> fetchAllTicket()
    {
        List<TicketResponseDto> allTickets=ticketService.fetchAllTicket();
        return ResponseEntity.ok(allTickets);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TicketResponseDto> fetchTicket(@PathVariable long id)
    {
        return ticketService.fetchTicket(id)
        		.map(ticket -> ResponseEntity.ok(ticket))
        		.orElseGet(() -> ResponseEntity.notFound().build());
    }
}
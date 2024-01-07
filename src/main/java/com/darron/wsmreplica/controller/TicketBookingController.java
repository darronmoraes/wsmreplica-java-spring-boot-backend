package com.darron.wsmreplica.controller;

import com.darron.wsmreplica.dto.TicketBookingDTO;
import com.darron.wsmreplica.service.TicketBookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@Slf4j
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @GetMapping
    public List<TicketBookingDTO> getAllTicketBookings() {
        log.info("Fetch All Ticket Bookings");
        return ticketBookingService.ticketBookings();
    }
}

package com.wilmanSaragihSitioJPlane.service;

import com.wilmanSaragihSitioJPlane.Account;
import com.wilmanSaragihSitioJPlane.Plane;
import com.wilmanSaragihSitioJPlane.Ticket;
import com.wilmanSaragihSitioJPlane.repository.AccountRepository;
import com.wilmanSaragihSitioJPlane.repository.PlaneRepository;
import com.wilmanSaragihSitioJPlane.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Ticket getTicket(Long ticketID){
        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new
                RuntimeException("Ticket not found"));
        return ticket;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

//    public Ticket bookTicket(Long buyerId, Long planeId, String code) {
//        Plane plane = planeRepository.findById(planeId);
//        Account buyer = accountRepository.findById(buyerId);
//
//
//    }
}

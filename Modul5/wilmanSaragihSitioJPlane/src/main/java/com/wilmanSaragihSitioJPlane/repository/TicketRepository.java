package com.wilmanSaragihSitioJPlane.repository;

import com.wilmanSaragihSitioJPlane.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    public Ticket findFirstByCode(String code);
}

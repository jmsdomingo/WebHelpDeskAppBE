package com.dev.webhelpdeskapp.repository;

import com.dev.webhelpdeskapp.model.TicketData;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.security.krb5.internal.Ticket;

public interface TicketRepo extends JpaRepository<TicketData, Integer> {
    void deleteTicketById(Integer id);
}

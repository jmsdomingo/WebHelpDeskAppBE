package com.dev.webhelpdeskapp.service;


import com.dev.webhelpdeskapp.model.TicketData;
import com.dev.webhelpdeskapp.repository.EmployeeRepo;
import com.dev.webhelpdeskapp.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepo ticketRepo;

    @Autowired
    public TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public TicketData addTicket(TicketData ticketData){
        return ticketRepo.save(ticketData);
    }

    public List<TicketData> findAllTicket(){
        return ticketRepo.findAll();
    }

    public TicketData updateTicket(TicketData ticketData){
        return ticketRepo.save(ticketData);
    }

    public void delTicket(Integer id){
        ticketRepo.deleteById(id);
    }
}

package com.dev.webhelpdeskapp.controller;

import com.dev.webhelpdeskapp.model.EmployeeData;
import com.dev.webhelpdeskapp.model.TicketData;
import com.dev.webhelpdeskapp.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketAPI {

    private final TicketService ticketService;

    public TicketAPI(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/add")
    public ResponseEntity<TicketData> addTicketData(@RequestBody TicketData ticketData){
        TicketData newTicket = ticketService.addTicket(ticketData);
        //handling exception
        return new ResponseEntity<>(newTicket, HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<TicketData>> viewTicket(){
        List<TicketData> ticketDataList = ticketService.findAllTicket();
        //handling exception
        return new ResponseEntity<>(ticketDataList, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<TicketData> updateTicketData(@RequestBody TicketData ticketData){
        TicketData updateTicket = ticketService.updateTicket(ticketData);
        return new ResponseEntity<>(updateTicket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delTicketData(@PathVariable("id")Integer id){
        ticketService.delTicket(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

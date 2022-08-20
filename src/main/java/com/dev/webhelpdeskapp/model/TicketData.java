package com.dev.webhelpdeskapp.model;

import sun.security.krb5.internal.Ticket;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class TicketData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ticket_number", length = 50, nullable = false)
    private int ticketNumber;

    @Column(name = "title", length = 50, nullable = false)
    private String ticketTitle;

    @Column(name = "description", length = 50, nullable = false)
    private String ticketDescription;

    @Column(name = "severity", length = 50, nullable = false)
    private String ticketSeverity;

    @Column(name = "status", length = 50, nullable = false)
    private String ticketStatus;

    @Column(name = "assignee", length = 50, nullable = false)
    private String ticketAssignee;

    @Column(name = "watcher", length = 50, nullable = false)
    private String ticketWatcher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public String getTicketSeverity() {
        return ticketSeverity;
    }

    public void setTicketSeverity(String ticketSeverity) {
        this.ticketSeverity = ticketSeverity;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getTicketAssignee() {
        return ticketAssignee;
    }

    public void setTicketAssignee(String ticketAssignee) {
        this.ticketAssignee = ticketAssignee;
    }

    public String getTicketWatcher() {
        return ticketWatcher;
    }

    public void setTicketWatcher(String ticketWatcher) {
        this.ticketWatcher = ticketWatcher;
    }

    @Override
    public String toString() {
        return "TicketData{" +
                "id=" + id +
                ", ticketNumber=" + ticketNumber +
                ", ticketTitle='" + ticketTitle + '\'' +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", ticketSeverity='" + ticketSeverity + '\'' +
                ", ticketStatus='" + ticketStatus + '\'' +
                ", ticketAssignee='" + ticketAssignee + '\'' +
                ", ticketWatcher='" + ticketWatcher + '\'' +
                '}';
    }

    public TicketData(Integer id, int ticketNumber, String ticketTitle, String ticketDescription, String ticketSeverity, String ticketStatus, String ticketAssignee, String ticketWatcher) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.ticketTitle = ticketTitle;
        this.ticketDescription = ticketDescription;
        this.ticketSeverity = ticketSeverity;
        this.ticketStatus = ticketStatus;
        this.ticketAssignee = ticketAssignee;
        this.ticketWatcher = ticketWatcher;
    }
    
    public TicketData(){
        
    }
}


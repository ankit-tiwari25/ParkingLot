package repository;

import exception.TicketNotFoundException;
import model.Ticket;

import java.util.Map;

public class TicketRepo {
    private Map<Integer, Ticket> tickets;

    public Ticket getTicket(int ticketId){
        Ticket ticket = tickets.get(ticketId);
        if(ticket == null){
            throw  new TicketNotFoundException("Ticket not found with id " + ticketId);
        }
        return ticket;
    }
    public void put(Ticket ticket){
        if(ticket != null){
            tickets.put(ticket.getId(), ticket);
            System.out.println("Ticket added successfully");
        }
    }
}

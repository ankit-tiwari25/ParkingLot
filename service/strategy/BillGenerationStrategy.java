package service.strategy;

import model.Bill;
import model.Ticket;

public interface BillGenerationStrategy {
    Bill getBill(Ticket ticket);
}

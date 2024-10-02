package com.wilmanSaragihSitioJPlane;

import com.wilmanSaragihSitioJPlane.service.AccountService;
import com.wilmanSaragihSitioJPlane.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class WilmanSaragihSitioJPlaneApplication{

	@Autowired
	private AccountService accountService;


	public static void main(String[] args) {
		SpringApplication.run(WilmanSaragihSitioJPlaneApplication.class, args);
	}

	@Autowired
	private TicketService ticketService;

	@Bean
	public ApplicationRunner initializer (){
		return args -> {
			List<Account> accounts = accountService.getAllUsers();
			System.out.println("All accounts:");
			accounts.forEach(account -> System.out.println(account));

//			Account account = accountService.topUpBalance(22, "wilman", "wilman", 200000);

//			Ticket ticket = ticketService.bookTicket(1L, 1L, "KL774");
			System.out.println("Added ticket:");
//			System.out.println(ticketService.getTicket(ticket.getId()));
			System.out.println("All ticket:");
			List<Ticket> tickets = ticketService.getAllTickets();
			tickets.forEach(x -> System.out.println(x));
			List<Account> updatedAccounts = accountService.getAllUsers();
			System.out.println("All accounts updated:");
			updatedAccounts.forEach(x -> System.out.println(x));
		};
	}

}

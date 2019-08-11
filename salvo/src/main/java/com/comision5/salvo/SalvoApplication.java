package com.comision5.salvo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {
	public static void main(String[] args) {
		SpringApplication.run(com.comision5.salvo.SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository) {
		return (args) -> {
			// save a couple of customers
			playerRepository.save(new Player("Jack@Bauer.com"));
			playerRepository.save(new Player("Chloe@Obrian.com"));
			playerRepository.save(new Player("Kim@Bauer.com"));
			playerRepository.save(new Player("David@Palmer.com"));
			playerRepository.save(new Player("Michelle@Dessler.com"));
		};
	}
}

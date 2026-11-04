package prueba.animales;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import prueba.animales.repositories.AnimalRepository;

@SpringBootApplication
public class AnimalesApplication {

	@Bean
	CommandLineRunner semillaAnimales(AnimalRepository ar) {
		return (args) -> {};
	}

	public static void main(String[] args) {
		SpringApplication.run(AnimalesApplication.class, args);
	}

}

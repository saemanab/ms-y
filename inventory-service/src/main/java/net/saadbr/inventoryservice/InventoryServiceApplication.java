package net.saadbr.inventoryservice;

import net.saadbr.inventoryservice.entities.Product;
import net.saadbr.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder().name("Comptuer").price(12000).quantity(10).build());
			productRepository.save(Product.builder().name("Printer").price(3500).quantity(5).build());
			productRepository.save(Product.builder().name("Phone").price(11500).quantity(20).build());
		};
	}
}

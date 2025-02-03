package com.example.invetory_service;

import com.example.invetory_service.model.Inventory;
import com.example.invetory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvetoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvetoryServiceApplication.class, args); // This is the main method of the application
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("SKU123");
			inventory.setQuantity(10);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("13452");
			inventory1.setQuantity(32);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("1234");
			inventory2.setQuantity(43);
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}

}

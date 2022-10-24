package com.clothingfly.catalog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class CatalogApplication {


	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ItemServiceImpl itemService){
		return args -> {
			Item item1 = new Item(1, "Red Striped T-Shirt", 30, 0, 5,"/assets/stripe-t-shirt.png" );
			Item item2 = new Item(2, "Loose Working Pants", 46, 0, 7,"/assets/working-pants.png" );
			Item item3 = new Item(3, "Jordan 1 Retro High", 215, 0, 6,"/assets/jordan-1-retro.png" );
			Item item4 = new Item(4, "Slouchy Crew Socks", 12, 0, 8,"/assets/ugg-crew-socks.png" );
			Item item5 = new Item(5, "Ducks Unlimited Hat", 25, 0, 10,"/assets/ducks-unlimited-hat.png" );
			Item item6 = new Item(6, "Fossil Gold Watch", 130, 0, 5,"/assets/fossil-gold-watch.png" );
			itemService.save(item1);
			itemService.save(item2);
			itemService.save(item3);
			itemService.save(item4);
			itemService.save(item5);
			itemService.save(item6);
		};

	}

}

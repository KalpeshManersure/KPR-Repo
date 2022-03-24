package com.KPR;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.KPR.accessingdatajpa.ProductRepository;
import com.KPR.entity.Product;import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class KprApplication {
    private static final Logger log = LoggerFactory.getLogger(KprApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(KprApplication.class, args);
	}
	
	@Bean
	  public CommandLineRunner demo(ProductRepository repository) {
	    return (args) -> {
	      // fetch an individual product by ID
	      Product product = repository.findById(1);
	      log.info("product found with findById(1):");
	      log.info("--------------------------------");
	      log.info(product.toString());
	      log.info("");
	    };
	  }

}

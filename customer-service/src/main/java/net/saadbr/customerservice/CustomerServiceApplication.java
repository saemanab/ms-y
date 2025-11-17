package net.saadbr.customerservice;

import net.saadbr.customerservice.config.CustomerConfigParams;
import net.saadbr.customerservice.entities.Customer;
import net.saadbr.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("Saad").email("saad.elmabrouk@icloud.com").build());
            customerRepository.save(Customer.builder().name("Samir").email("samir.elbouzidi@icloud.com").build());
            customerRepository.save(Customer.builder().name("Amine").email("amine.guenfoudi@icloud.com").build());
        };
    }
}

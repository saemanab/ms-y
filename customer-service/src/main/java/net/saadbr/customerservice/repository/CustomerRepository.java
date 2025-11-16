package net.saadbr.customerservice.repository;

import net.saadbr.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author saade
 **/
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

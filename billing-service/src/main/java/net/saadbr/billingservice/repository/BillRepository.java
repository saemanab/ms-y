package net.saadbr.billingservice.repository;

import net.saadbr.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author saade
 **/
@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long> {
}

package net.saadbr.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.saadbr.billingservice.model.Customer;

import java.util.Date;
import java.util.List;

/**
 * @author saade
 **/
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue
    private Long id;
    private Date billingDate;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    @Transient
    private Customer customer;
}

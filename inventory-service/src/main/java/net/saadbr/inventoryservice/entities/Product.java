package net.saadbr.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author saade
 **/
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class Product {
    @Id @GeneratedValue
    private long id;
    private String name;
    private double price;
    private int quantity;
}

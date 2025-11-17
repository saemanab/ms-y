package net.saadbr.billingservice.model;

import lombok.*;

/**
 * @author saade
 **/
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantity;
}

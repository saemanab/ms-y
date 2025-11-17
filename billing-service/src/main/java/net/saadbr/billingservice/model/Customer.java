package net.saadbr.billingservice.model;

import lombok.*;

/**
 * @author saade
 **/
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    private Long id;
    private String name;
    private String email;
}

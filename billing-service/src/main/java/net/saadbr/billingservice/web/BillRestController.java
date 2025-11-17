package net.saadbr.billingservice.web;

import net.saadbr.billingservice.entities.Bill;
import net.saadbr.billingservice.feign.CustomerServiceRestClient;
import net.saadbr.billingservice.feign.InventoryServiceRestClient;
import net.saadbr.billingservice.model.Customer;
import net.saadbr.billingservice.repository.BillRepository;
import net.saadbr.billingservice.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author saade
 **/
@RestController
@RequestMapping("/api")
public class BillRestController {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private CustomerServiceRestClient customerServiceRestClient;
    @Autowired
    private InventoryServiceRestClient inventoryServiceRestClient;

    @GetMapping("/bills/{id}")
    public Bill getBillById(@PathVariable long id) {
        Bill bill = billRepository.findById(id).get();
        Customer customer = customerServiceRestClient.findCustomerById(bill.getCustomerId());
        bill.setCustomer(customer);
        bill.getProductItems().forEach(productItem -> {
            productItem.setProduct(
                    inventoryServiceRestClient.getProduct(productItem.getProductId())
            );
        });
        return bill;
    }
}

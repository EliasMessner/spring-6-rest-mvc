package guru.springframework.spring6restmvc.service;

import java.util.List;
import java.util.UUID;

import guru.springframework.spring6restmvc.model.Customer;

public interface CustomerService {

    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteById(UUID customerId);
}

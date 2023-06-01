package anil.enocaBackChallenge.business.service;

import anil.enocaBackChallenge.dataAccess.CustomerRepository;
import anil.enocaBackChallenge.entitiy.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        // İşlem detayı ekleme
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        // İşlem detayı güncelleme
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        // İşlem detayı silme
        customerRepository.deleteById(customerId);
    }

    public List<Customer> getAllCustomers() {
        // İşlem detayı listeleme
        return customerRepository.findAll();
    }
}

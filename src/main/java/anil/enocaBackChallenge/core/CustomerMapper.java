package anil.enocaBackChallenge.core;

import anil.enocaBackChallenge.dto.CustomerDTO;
import anil.enocaBackChallenge.entitiy.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private final ModelMapper modelMapper;

    public CustomerMapper() {
        this.modelMapper = new ModelMapper();
    }

    public CustomerDTO toDTO(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer toEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }
}


package anil.enocaBackChallenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private Date createDate;
    private Long id;
    private double totalPrice;
    private CustomerDTO customer;

}

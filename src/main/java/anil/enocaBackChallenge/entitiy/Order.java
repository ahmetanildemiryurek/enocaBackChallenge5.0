package anil.enocaBackChallenge.entitiy;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "totalPrice")
    private int totalPrice;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Customer customer;
}

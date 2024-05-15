package ra.demo_thymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;
    @Column(name = "product_name")
    private String proName;
    @Column(name = "producer")
    private String producer;
    @Column(name = "year_making")
    private Integer yearMaking;
    @Column(name = "expire_date")
    private Date expireDate;
    @Column(name = "price")
    private Double price;
}

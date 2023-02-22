package starbucks.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private Long price;
    private String discription;
    private String title_image;
    private String info_image;

//    private Long amount;
//    private boolean newproduct;
//    private boolean best;
//    private String status;
//    private String size;
//    private Date date;
//    private int recommand;

}

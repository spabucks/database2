package starbucks.smallcategory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import starbucks.bigcategory.model.BigCategory;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SmallCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String smallCategory;
}

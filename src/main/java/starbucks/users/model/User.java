package starbucks.users.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false, length = 45)
    private String nickname;
    @Column(nullable = false)
    private String pwd;

    private String email;
//    private String phone;
//    private Long star;
//    private String car;
//    private Date birth;
//    private boolean gender;
//    private String grade;
}

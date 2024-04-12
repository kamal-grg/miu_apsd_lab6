package asd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address addressId;

    @OneToOne
    @JoinColumn(name = "roleId")
    private Role roleId;
}

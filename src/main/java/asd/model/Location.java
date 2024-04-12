package asd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    private String name;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private Address address;
}

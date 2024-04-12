package asd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billId;

    @OneToMany
    @JoinColumn(name = "appointmentId", unique = false)
    private List<Appointment> appointmentId;
    private Integer amount;
    private String status;
}

package asd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointDate;
    private LocalDate appointTime;

    @ManyToOne
    @JoinColumn(name = "locationId", unique = false)
    private Location locationId;

    @ManyToOne
    @JoinColumn(name = "patientId", unique = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "dentistId", unique = false)
    private Dentist dentist;
}

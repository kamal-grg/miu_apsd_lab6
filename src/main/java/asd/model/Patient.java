package asd.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@NoArgsConstructor
@Entity
public class Patient extends User{
    private LocalDate DOB;
}

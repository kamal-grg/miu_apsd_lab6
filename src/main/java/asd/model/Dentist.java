package asd.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
@Data
@NoArgsConstructor
@Entity
public class Dentist extends User{
    private String specialzation;
}

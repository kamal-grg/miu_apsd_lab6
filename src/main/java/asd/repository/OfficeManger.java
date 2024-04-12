package asd.repository;

import asd.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jinxu Zheng
 * @Date 4/11/2024
 **/
public interface OfficeManger extends JpaRepository<Patient, Long> {
}

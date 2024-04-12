package asd.service;


import asd.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();
    Dentist addNewDentist(Dentist newDentist);

    Dentist getDentistId(Long dentistId);

    Dentist updateDentist(Dentist editedDentist);

    void deleteDentistById(Long dentistId);

}

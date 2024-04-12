package asd.service.impl;


import asd.model.Dentist;
import asd.repository.DentistRepository;
import asd.service.DentistService;

import java.util.List;

public class DentistServiceImpl implements DentistService {


    //    @Autowired
    private DentistRepository dentistRepository;

    //    @Autowired
    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist addNewDentist(Dentist newPublisher) {
        return dentistRepository.save(newPublisher);
    }

    @Override
    public Dentist getDentistId(Long publisherId) {
        return dentistRepository.findById(publisherId)
                .orElse(null);
    }

    @Override
    public Dentist updateDentist(Dentist editedPublished) {
        return dentistRepository.save(editedPublished);
    }

    @Override
    public void deleteDentistById(Long publisherId) {
        dentistRepository.deleteById(publisherId);
    }
}

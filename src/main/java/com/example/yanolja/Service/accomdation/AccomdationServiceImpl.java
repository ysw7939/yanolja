package com.example.yanolja.Service.accomdation;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.repository.accomdation.AccomdationRepository;

import java.util.Optional;

public class AccomdationServiceImpl implements AccomdationService{
    private final AccomdationRepository accomdationRepository;

    public AccomdationServiceImpl(AccomdationRepository accomdationRepository) {
        this.accomdationRepository = accomdationRepository;
    }

    @Override
    public Accomodation save(Accomodation accomodation) {
        return accomdationRepository.save(accomodation);
    }

    @Override
    public Optional<Accomodation> findbyid(long id) {
        Optional<Accomodation> accomodationOptional = accomdationRepository.findbyid(id);
        if (accomodationOptional.isPresent()) {
            return accomodationOptional;
        }
        return Optional.empty();
    }
}

package com.example.yanolja.Service.accomdation;

import com.example.yanolja.domain.accomodation.Accomodation;

import java.util.Optional;

public interface AccomdationService {
    Accomodation save(Accomodation accomodation);
    Optional<Accomodation> findbyid(long id);
}

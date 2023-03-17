package com.example.yanolja.repository.accomdation;

import com.example.yanolja.domain.accomodation.Accomodation;

import java.util.Optional;

public interface AccomdationRepository {
    Accomodation save(Accomodation accomodation);
    Optional<Accomodation> findbyid(long id);
}

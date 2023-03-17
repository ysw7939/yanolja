package com.example.yanolja.repository.accomdation;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.domain.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MemoryAccomdationRepository implements AccomdationRepository{
    private static long sequence = 0L;
    private static final Map<Long, Accomodation> store = new HashMap<>();
    @Override
    public Accomodation save(Accomodation accomodation) {
        accomodation.setId(++sequence);
        return store.put(accomodation.getId(),accomodation);
    }

    @Override
    public Optional<Accomodation> findbyid(long id) {
        return Optional.ofNullable(store.get(id));
    }
}

package com.guergen.bandaide.user;

import com.guergen.bandaide.Instrument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findByInstrument(Instrument instrument);
}

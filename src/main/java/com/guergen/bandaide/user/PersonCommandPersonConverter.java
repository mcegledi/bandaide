package com.guergen.bandaide.user;

import com.guergen.command.PersonCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonCommandPersonConverter implements Converter<PersonCommand, Person> {
    @Override
    public Person convert(PersonCommand pc) {
        Person person = new Person(pc.getName(), pc.getInstrument());

        return person;
    }
}

package com.guergen.bandaide.user;

import com.guergen.command.PersonCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonPersonCommandConverter implements Converter<Person, PersonCommand> {
    @Override
    public PersonCommand convert(Person person) {

        PersonCommand command = new PersonCommand();
        command.setId(person.get_id());
        command.setName(person.getName());
        command.setInstrument(person.getInstrument());

        return command;
    }
}

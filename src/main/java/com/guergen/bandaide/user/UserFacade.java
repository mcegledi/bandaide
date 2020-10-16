package com.guergen.bandaide.user;

import com.guergen.command.PersonCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserFacade {

    @Autowired
    UserService userService;

    @Autowired
    PersonCommandPersonConverter toPersonConverter;

    @Autowired
    PersonPersonCommandConverter toPersonCommandConverter;

    public List<PersonCommand> findAll() {

        return userService.findAll().stream().map(toPersonCommandConverter::convert)
                .collect(Collectors.toList());
    }

    public void add(PersonCommand personCommand) {
        userService.add(toPersonConverter.convert(personCommand));
    }
}

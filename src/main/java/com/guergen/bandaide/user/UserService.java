package com.guergen.bandaide.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        return repository.findAll();
    }

    public void add(Person person) {
        repository.insert(person);
    }
}

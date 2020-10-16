package com.guergen.bandaide.user;

import com.guergen.bandaide.Instrument;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
@Data
public class Person {

    @Id
    private String _id;

    @Indexed(unique = true)
    private String name;
    private Instrument instrument;

    public Person(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }
}

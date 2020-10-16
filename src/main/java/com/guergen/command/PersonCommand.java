package com.guergen.command;

import com.guergen.bandaide.Instrument;
import lombok.Data;

@Data
public class PersonCommand {

    String id;
    String name;
    Instrument instrument;
}

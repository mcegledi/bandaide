package com.guergen.bandaide.song;

import lombok.Data;

@Data
public class SongCommand {

    String id;
    String songname;
    String interpreter;
    String year;
    String comment;

}

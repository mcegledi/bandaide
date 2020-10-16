package com.guergen.bandaide.song;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
@Data
public class Song {

    @Id
    public String _id;

    @Indexed(unique = true, background = true)
    public String songname;

    @Indexed(unique = true, background = true)
    public String interpreter;
    public String year;
    public String comment;

    public Song(String songname, String interpreter, String year, String comment) {
        this.songname = songname;
        this.interpreter = interpreter;
        this.year = year;
        this.comment = comment;
    }

}

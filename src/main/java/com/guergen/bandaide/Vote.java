package com.guergen.bandaide;

import com.guergen.bandaide.user.Person;
import com.guergen.bandaide.song.Song;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "bandmanager")
public class Vote {

    private Song song;
    private Person person;
    private Boolean voting;
    private String comment;
    private LocalDate creationDate;

    public Vote(Song song, Person person, Boolean voting, String comment) {
        this.song = song;
        this.person = person;
        this.voting = voting;
        this.comment = comment;

        this.creationDate = LocalDate.now();
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Boolean getVoting() {
        return voting;
    }

    public void setVoting(Boolean voting) {
        this.voting = voting;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

package com.guergen.bandaide;

import com.guergen.bandaide.user.Person;
import com.guergen.bandaide.song.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VoteRepository extends MongoRepository<Vote, String> {

    public List<Vote> findBySong(Song song);
    public List<Vote> findByPerson(Person person);

}

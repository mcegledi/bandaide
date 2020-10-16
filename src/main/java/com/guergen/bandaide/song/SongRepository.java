package com.guergen.bandaide.song;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {

    public Song findBySongname(final String songname);
    public Song findByInterpreter(final String interpreter);

}

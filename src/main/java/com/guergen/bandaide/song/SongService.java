package com.guergen.bandaide.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    @Autowired
    SongSongCommandConverter songSongCommandConverter;


    public void  addOrUpdateSong(final String id, final String songname, final String interpreter, final String year, final String comment) {

        Song song;

        if(id == null || id.isEmpty()) {
            song = songRepository.findBySongname(songname);
            if (song == null ) {
                song = new Song(songname, interpreter, year, comment);
            } else {
                song.setSongname(songname);
                song.setInterpreter(interpreter);
                song.setYear(year);
                song.setComment(comment);
                song.set_id(id);
            }
        } else {
            song = songRepository.findById(id).orElse(new Song(songname, interpreter, year, comment));
            song.setSongname(songname);
            song.setInterpreter(interpreter);
            song.setYear(year);
            song.setComment(comment);
        }

        songRepository.save(song);
    }

    public void addOrUpdateSong(final SongCommand sc) {

        addOrUpdateSong(sc.getId(), sc.getSongname(), sc.getInterpreter(), sc.getYear(), sc.getComment());

    }

    public List<Song> findAll() {
        return songRepository.findAll();
    }

    public SongCommand get(final String id) {

        Optional<Song> searchSong = songRepository.findById(id);
        if(searchSong.isPresent())
            return songSongCommandConverter.convert(searchSong.get());
        else
            return new SongCommand();
    }

    public void delete(String id) {

        songRepository.deleteById(id);
    }
}

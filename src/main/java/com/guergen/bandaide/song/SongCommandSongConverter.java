package com.guergen.bandaide.song;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SongCommandSongConverter implements Converter<SongCommand, Song> {
    @Override
    public Song convert(SongCommand songCommand) {

        Song newSong = new Song(songCommand.getSongname(), songCommand.getInterpreter(), songCommand.getYear(), songCommand.getComment());
        newSong.set_id(songCommand.getId());
        return newSong;
    }
}

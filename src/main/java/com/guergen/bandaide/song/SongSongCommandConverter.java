package com.guergen.bandaide.song;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SongSongCommandConverter implements Converter<Song, SongCommand> {
    @Override
    public SongCommand convert(Song song) {
        SongCommand songCommand = new SongCommand();
        songCommand.setId(song.get_id());
        songCommand.setSongname(song.songname);
        songCommand.setInterpreter(song.getInterpreter());
        songCommand.setYear(song.getYear());
        songCommand.setComment(song.getComment());
        return songCommand;
    }

}

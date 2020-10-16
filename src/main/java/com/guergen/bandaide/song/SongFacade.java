package com.guergen.bandaide.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SongFacade {

    @Autowired
    SongService songService;


}

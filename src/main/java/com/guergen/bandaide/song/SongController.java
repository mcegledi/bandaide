package com.guergen.bandaide.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    SongService songservice;

    @GetMapping("/list")
    public String songs(Model model) {

        model.addAttribute("allSongs", songservice.findAll());
        return "songs";
    }


    @GetMapping("/add")
    public String addSongGet(Model model) {

        model.addAttribute("command", new SongCommand());

        return "addSong";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, Model model) {

        SongCommand songCommand = songservice.get(id);

        model.addAttribute("command", songCommand);
        return "addSong";

    }

    @PostMapping("/addSong")
    public String addSong(@ModelAttribute("command")SongCommand songCommand) {

        songservice.addOrUpdateSong(songCommand);

        return "redirect:/songs/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {

        songservice.delete(id);

        return "redirect:/songs/list";
    }
}

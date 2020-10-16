package com.guergen.controller;

import com.guergen.tonicandscales.Note;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FooController {

    @ModelAttribute
    Note getNotes() {
        return Note.A_SQUARE;
    }


    @GetMapping("/foo")
    public String foo(final Model model) {

        model.addAttribute("message", "Hello World!");
        return "foo";
    }

    @GetMapping("/basescale")
    public String basescale(final Model model) {

        return "basescale";
    }
}

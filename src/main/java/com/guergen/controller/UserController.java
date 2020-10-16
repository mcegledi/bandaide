package com.guergen.controller;

import com.guergen.bandaide.user.UserFacade;
import com.guergen.command.PersonCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserFacade userFacade;

    @GetMapping("/list")
    public String list(Model model) {

        List<PersonCommand> personList = userFacade.findAll();
        model.addAttribute("allPersons", personList);

        return "bandmember";
    }

    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("command", new PersonCommand());
        return "addUser";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("command") PersonCommand personCommand) {
        userFacade.add(personCommand);

        return "redirect:/users/list";
    }

}

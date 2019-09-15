package com.besandr.web.controllers;

import com.besandr.repository.entities.Languages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/changeLanguage")
@SessionAttributes("language")
public class ChangingLanguageController {

    @RequestMapping(method = RequestMethod.GET)
    public String changeLanguage(@RequestParam String chosenLanguage, Model model) {
        //changing language if chosenLanguage parameter present
        if (chosenLanguage != null) {
            model.addAttribute("language", Languages.valueOf(chosenLanguage).getCode());
        }
        return "titlePage";
    }

}

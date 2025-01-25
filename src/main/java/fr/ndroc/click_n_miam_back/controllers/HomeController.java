package fr.ndroc.click_n_miam_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(Model model) {

        return "index.html";
    }
  
}

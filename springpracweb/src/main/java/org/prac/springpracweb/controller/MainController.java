package org.prac.springpracweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /* main.jsp를 호출하는 Controller */
    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }
}

package org.prac.springpracweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

    @GetMapping("/sales")
    public String salespage(Model model) {
        return "sales";
    }
}

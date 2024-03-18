package org.prac.springprac.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    /* 메인 페이지 */
    @GetMapping(path = "/main")
    public String main(Model model) {
        logger.info("메인 페이지 진입");
        return "main";
    }
}

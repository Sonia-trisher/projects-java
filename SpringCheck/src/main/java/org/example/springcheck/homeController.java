package org.example.springcheck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping
    public String hi() {
        return "index.html";
    }
}

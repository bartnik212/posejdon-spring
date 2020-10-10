package com.jakubbartnik.module.home;

import com.jakubbartnik.core.config.PosejdonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Autowired
    private PosejdonConfig posejdonConfig;

    @RequestMapping({"/", "/index.html", "/index.php"})
    public String getHome(Model model){

        model.addAttribute("greetings", homeService.getGreetings());
        return "home";

    }

    @RequestMapping("/config")
    public String getConfig(Model model){
        model.addAttribute("posejdonConfig", posejdonConfig);
        return "home";
    }
}

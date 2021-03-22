package kr.digitcom.securitydb.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    @ResponseBody
    @GetMapping("/adminOnly")
    public String adminOnly() {
        return "Secret Page";
    }
}

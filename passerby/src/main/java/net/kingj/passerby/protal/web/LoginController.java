package net.kingj.passerby.protal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    @ResponseBody
    public String loginPage(@RequestParam("next") Optional<String> next) throws Exception {
        throw new Exception("test ex");
    }

    @GetMapping("/register")
    public String register() throws Exception {
        return "register";
    }

    @PostMapping("/login")
    public String login(@RequestParam("next") Optional<String> next, String user, HttpSession session) {
        session.setAttribute("CURRENT_USER", user);
        return "redirect:".concat(next.orElse("/"));
    }
}

package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kata.spring.boot_security.demo.services.UserService;

@Controller
public class MainController {

    final
    UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model) {

        model.addAttribute("error", error != null);

        model.addAttribute("logout", logout != null);

        return "login";
    }

    @GetMapping("/user")
    public String showUserPage() {

        return "userPage";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
//        return "adminPage";

        return "product79";

    }
}

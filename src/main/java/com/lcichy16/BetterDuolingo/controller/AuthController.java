package com.lcichy16.BetterDuolingo.controller;

import com.lcichy16.BetterDuolingo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        // Tutaj dodamy logikę do zapisania użytkownika w bazie danych
        model.addAttribute("message", "Rejestracja zakończona sukcesem!");
        return "redirect:/login"; // Przekierowujemy użytkownika do strony logowania
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}

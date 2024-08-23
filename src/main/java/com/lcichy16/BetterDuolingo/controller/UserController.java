package com.lcichy16.BetterDuolingo.controller;

import com.lcichy16.BetterDuolingo.model.User;
import com.lcichy16.BetterDuolingo.model.UserProgress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.Date;  // Import klasy Date

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUserProfile(@RequestParam Long userId, Model model) {
        User user = new User(); // Pobierz dane użytkownika z bazy danych
        // Przykładowe dane
        user.setId(userId);
        user.setUsername("john_doe");
        user.setEmail("john@example.com");
        model.addAttribute("user", user);
        return "userProfile";
    }

    @GetMapping("/progress")
    public String getUserProgress(@RequestParam Long userId, Model model) {
        UserProgress userProgress = new UserProgress(userId); // Pobierz postępy z bazy danych
        // Przykładowe dane
        userProgress.updateProgress(101L, 85, true, new Date());
        model.addAttribute("userProgress", userProgress);
        return "userProgress";
    }

    @PostMapping("/updateProgress")
    public String updateProgress(@ModelAttribute UserProgress userProgress) {
        return "redirect:/progress?userId=" + userProgress.getUserId();
    }
}
/
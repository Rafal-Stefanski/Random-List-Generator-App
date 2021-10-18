package com.rafalstefanski.randomlistgenerator.controller.user;

import com.rafalstefanski.randomlistgenerator.model.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/users-gui")
public class UserController {

    private User[] getUsers() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate
                .getForObject("https://random-data-api.com/api/users/random_user?size=7",
                        User[].class);
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("users", getUsers());
        return "users-gui/users_view";
    }
}

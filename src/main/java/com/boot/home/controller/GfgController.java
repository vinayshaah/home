package com.boot.home.controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*@Controller
public class GfgController {

    @GetMapping("/")
    public String home(Principal principal, Authentication auth, Model model) {

        String username = principal.getName();
        Collection<? extends GrantedAuthority> roles = auth.getAuthorities();

        model.addAttribute("username", username);
        model.addAttribute("roles", roles);

        return "hello-gfg";
    }
} */
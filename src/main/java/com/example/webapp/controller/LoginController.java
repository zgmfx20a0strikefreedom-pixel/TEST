package com.example.webapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.webapp.form.LoginForm;
@Controller
@RequestMapping("/login")
public class LoginController {
@GetMapping
public String showLogin(@ModelAttribute LoginForm form) {
// templatesフォルダ配下のlogin.htmlに遷移
return "login";
}
}

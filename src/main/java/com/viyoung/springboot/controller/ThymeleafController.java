package com.viyoung.springboot.controller;


import com.viyoung.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vi-young
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public String page(Model model) {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setUserName("viyoung1");
        user1.setEmail("youngvilt1@gmail.com");
        User user2 = new User();
        user2.setUserName("viyoung2");
        user2.setEmail("youngvilt2@gmail.com");
        list.add(user1);
        list.add(user2);
        Map<String,Object> map = new HashMap<>();
        map.put("name","Vi-Young");
        map.put("list",list);
//        model.addAttribute("name","Vi-Young");
//        model.addAttribute("user", user);
//        model.addAttribute("list",list);
        model.addAllAttributes(map);
        return "static/index";
    }

    @RequestMapping("/toHome")
    public String home(Model model) {
        return "static/home";
    }
}

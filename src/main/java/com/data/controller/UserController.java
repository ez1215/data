package com.data.controller;

import com.data.entity.User;
import com.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    private String userList(Model model){
        List<User> list = userService.getUserList();
        model.addAttribute("userList",list);
        return  "userList";
    }
}

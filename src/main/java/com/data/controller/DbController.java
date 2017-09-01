package com.data.controller;


import com.data.entity.Db;
import com.data.entity.User;
import com.data.service.DbService;
import com.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DbController {

    @Autowired
    private DbService dbService;

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return  "this is index";
    }

    @RequestMapping("/dbList")
    public String getDbList(Model model,String dbId){

        System.out.println(dbId);
        List<Db> dbList = dbService.getDbList();
        model.addAttribute("list",dbList);
        if(StringUtils.isEmpty(dbId)){
            List<User> list = userService.getUserList();
            model.addAttribute("userList",list);
            return "dbList";
        }
        Db db = dbService.getById(dbId);
        if(db == null){
            return "dbList";
        }

        return "dbList";
    }


}

package com.data.controller;


import com.data.entity.Db;
import com.data.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DbController {

    @Autowired
    private DbService dbService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return  "this is index";
    }

    @RequestMapping("/dbList")
    public String getDbList(Model model){
        List<Db> dbList = dbService.getDbList();
        model.addAttribute("list",dbList);
        return "dbList";
    }
}

package com.example.demo.controller;
import com.example.demo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.DeptService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAllUsers() {
        return deptService.getAllUsers().toString();
    }

    @RequestMapping(value = "/add")
    public String addNewUser(@RequestParam int id, @RequestParam String name) {
        Dept user = new Dept(id, name);
        deptService.addUser(user);
        return "Dept saved";
    }

    @RequestMapping("/delete")
    public String deleteUser(@RequestParam int id){
        deptService.deleteMyUser(id);
        return "Dept deleted";
    }

    @RequestMapping("/edit")
    public String editUser(@RequestParam int id) {
        deptService.editUser(id);
        return "dept edited";
    }
}
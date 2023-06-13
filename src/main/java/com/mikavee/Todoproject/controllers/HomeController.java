package com.mikavee.Todoproject.controllers;

import com.mikavee.Todoproject.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private TodoItemService todoItemService;

    // First time to serve points here
    @GetMapping("/")
    public ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", todoItemService.getall());
        return  modelAndView;
    }


}
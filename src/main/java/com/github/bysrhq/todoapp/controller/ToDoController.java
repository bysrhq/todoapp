/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.todoapp.controller;

import com.github.bysrhq.todoapp.domain.ToDoTitle;
import com.github.bysrhq.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bysrhq
 */
@Controller
@RequestMapping("/")
public class ToDoController {
    
    @Autowired
    private ToDoRepository toDoRepository;
    
    @GetMapping
    public String showToDoPage(Model model) {
        model.addAttribute("toDos", toDoRepository.findAll());
        
        return "ToDoPage";
    }
    
    @GetMapping(path = "/new")
    public String showToDoAddForm(ToDoTitle toDoTitle) {
        
        return "toDoForm";
    }
    
    @PostMapping(path = "/new")
    public String processToDoAddForm(ToDoTitle toDoTitle) {
        toDoRepository.save(toDoTitle);
        
        return "redirect:/";
    }
}

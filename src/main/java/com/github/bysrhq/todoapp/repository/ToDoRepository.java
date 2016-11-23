/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.todoapp.repository;

import com.github.bysrhq.todoapp.domain.ToDoTitle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bysrhq
 */
public interface ToDoRepository extends JpaRepository<ToDoTitle, String>{
    
}

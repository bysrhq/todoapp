/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.todoapp.repository;

import com.github.bysrhq.todoapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bysrhq
 */
public interface UserRepository extends JpaRepository<User, String>{
    
}

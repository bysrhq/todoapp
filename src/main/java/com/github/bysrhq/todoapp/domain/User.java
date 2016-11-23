/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.todoapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *   @author bysrhq
 */
@Entity
public class User {
    
    @Id
    private String username;
    private String passcode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafael.Valentim
 */
@Controller
public class HomeController {
    
    @GetMapping("logar")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
    
    @GetMapping("home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
    
    @GetMapping("admin")
    public ModelAndView admin() {
        return new ModelAndView("admin");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.config;

import br.com.rafaelvalentim.core.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Rafael.Valentim
 */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    
    @Autowired
    UsuarioService usuarioService;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/home").authenticated()
                .antMatchers("/logar").permitAll()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and().formLogin();
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(usuarioService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}

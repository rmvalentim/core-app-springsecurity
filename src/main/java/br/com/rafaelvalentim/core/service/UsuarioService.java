/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.service;

import br.com.rafaelvalentim.core.dao.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author Rafael.Valentim
 */
@Component
public class UsuarioService implements UserDetailsService {

    @Autowired
    UsuarioDAO usuarioDao;
    
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
       return usuarioDao.findUsuarioByLogin(login);        
    }
    
}

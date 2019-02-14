/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.dao;

import br.com.rafaelvalentim.core.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafael.Valentim
 */
@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    
    Usuario findUsuarioByLogin(String login);
    
    
}

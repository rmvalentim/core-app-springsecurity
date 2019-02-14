/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Rafael.Valentim
 */

@Entity
class Permissao implements Serializable, GrantedAuthority {
    
    @Id
    private String permissao;
    
     // Metodo referentes a autenticação do Spring Security
    
    @Override
    public String getAuthority() {
        return this.permissao;
    }
    
    // Getters e Setters

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    
    
    
}

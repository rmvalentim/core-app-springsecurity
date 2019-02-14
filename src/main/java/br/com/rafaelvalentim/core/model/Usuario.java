/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelvalentim.core.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Rafael.Valentim
 */
@Entity
public class Usuario implements Serializable, UserDetails {
    
    @Id
    private Long id;
    
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;
    
    @OneToMany(fetch=FetchType.EAGER)
    private List<Permissao> permissoes;
    
    // Metodos referentes a autenticação do Spring Security
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.permissoes;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.ativo;
    }
    
    // Getters e Setters 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }
    
}

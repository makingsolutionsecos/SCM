/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dto;

import java.util.HashMap;

/**
 *
 * @author sforerop
 */
public class LoginDto {
    
    /**
     * nombre de usuario para iniciar session
     */
    private String nombreUsuario;
    
    /**
     * Contraseña del usuario para iniciar session
     */
    private String contraseniaUsuario;
    
    HashMap<String, String> hashMapLogin;

    
    /**
     * get nombre de usuaro
     * @return String nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Set nombre de usuario
     * @param nombreUsuario 
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * get contraseña usuario
     * @return 
     */
    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    /**
     * set contraseña usuario
     * @param contraseniaUsuario 
     */
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    /**
     * get hashmap login
     * @return 
     */
    public HashMap<String, String> getHashMapLogin() {
        return hashMapLogin;
    }

    /**
     * set hashmap login
     * @param hashMapLogin 
     */
    public void setHashMapLogin(HashMap<String, String> hashMapLogin) {
        this.hashMapLogin = hashMapLogin;
    }  
    
}

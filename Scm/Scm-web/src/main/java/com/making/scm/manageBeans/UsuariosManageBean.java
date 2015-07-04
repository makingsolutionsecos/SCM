/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.manageBeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean(name = "usuariosManageBean")
@RequestScoped
public class UsuariosManageBean {
    
    /**---Variables---**/
    
    public String nombreUsr;

    /**
     * Creates a new instance of UsuariosManageBean
     */
    public UsuariosManageBean() {
    }
    
    
    @PostConstruct
    public void init(){
        cargarVariables();
    }
    
    public void cargarVariables(){
        nombreUsr = "Sergio";        
    }
    
    
    /**----Geter's and Setter's ---**/
    
    /**
     * 
     * @return 
     */
     public String getNombreUsr() {
        return nombreUsr;
    }

     /**
      * 
      * @param nombreUsr 
      */
    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }
}

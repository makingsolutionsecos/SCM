/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.manageBeans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Your Name
 */
@ManagedBean
@ViewScoped
public class HomeManagedBean {

    private int idRol;
    private boolean renderedMenuUsuario;

   

    public void redirigirAutenticacion() {
        try {
            renderedMenuUsuario = idRol == 1;
            if (idRol == 1) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.getExternalContext().redirect("webresources/doctor");
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.getExternalContext().redirect("webresources/administration");
            }
        } catch (IOException ex) {
            Logger.getLogger(HomeManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void validarEntrada() {
        
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public boolean isRenderedMenuUsuario() {
        return renderedMenuUsuario;
    }

    public void setRenderedMenuUsuario(boolean renderedMenu) {
        this.renderedMenuUsuario = renderedMenu;
    }

}

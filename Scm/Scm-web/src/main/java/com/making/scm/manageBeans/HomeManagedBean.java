/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.manageBeans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
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

    public void redirigirAutenticacion() {
        try {
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

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

}

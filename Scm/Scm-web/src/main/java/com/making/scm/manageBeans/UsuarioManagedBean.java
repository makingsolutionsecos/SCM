package com.making.scm.manageBeans;

import com.making.scm.dto.UsuarioDto;
import com.making.scm.negocio.usuario.UsuarioServiceBeanLocal;
import java.awt.event.ActionEvent;
import java.io.IOException;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean implements Serializable {

    private UsuarioDto usuarioDto;

    @EJB
    private UsuarioServiceBeanLocal usuarioServiceBeanLocal;

    public UsuarioManagedBean() {
    }

    public void crearUSuario(ActionEvent actionEvent) {
        usuarioServiceBeanLocal.guardarUsuario(usuarioDto);
    }

    public void listarUsuarios() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ServletContext servletContext= (ServletContext) context.getCurrentInstance().getExternalContext().getContext();
            context.getExternalContext().redirect(servletContext.getContextPath()+ "/usuario/listarUsuario.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(HomeManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UsuarioDto getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(UsuarioDto usuarioDto) {
        this.usuarioDto = usuarioDto;
    }
}

package com.making.scm.manageBeans;

import com.making.scm.controlador.RegistroServiceBeanLocal;
import com.making.scm.controlador.UsuarioServiceBeanLocal;
import com.making.scm.dto.RegistroDto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.negocio.usuario.UsuarioServiceBeanLocal;
import java.awt.event.ActionEvent;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean implements Serializable {

    private UsuarioDto usuarioDto;
    private List<RegistroDto> registrosList;
    

    @EJB
    private UsuarioServiceBeanLocal usuarioServiceBeanLocal;
    
    @EJB
    private RegistroServiceBeanLocal registroServiceBeanLocal;
    
    

    public UsuarioManagedBean() {
    }

    public void crearUSuario(ActionEvent actionEvent) {
        usuarioServiceBeanLocal.guardarUsuario(usuarioDto);
    }
    
    public void listarRegistrosByUsuario(ActionEvent actionEvent){
        registroServiceBeanLocal.findByUsuario("1");
    }
    
    public static void  listarUsuarios(){
       
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

    public List<RegistroDto> getRegistrosList() {
        return registrosList;
    }

    public void setRegistrosList(List<RegistroDto> registrosList) {
        this.registrosList = registrosList;
    }
    
}

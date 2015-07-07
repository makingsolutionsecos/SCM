    package com.making.scm.manageBeans;

import com.making.scm.controlador.RegistroServiceBeanLocal;
import com.making.scm.controlador.UsuarioServiceBeanLocal;
import com.making.scm.dto.UsuarioDto;
import java.awt.event.ActionEvent;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RegistroManagedBean implements Serializable {

    private UsuarioDto usuarioDto;
    

    @EJB
    private UsuarioServiceBeanLocal usuarioServiceBeanLocal;
    
    @EJB
    private RegistroServiceBeanLocal registroServiceBeanLocal;
    
    

    public RegistroManagedBean() {
    }

    public void crearUSuario(ActionEvent actionEvent) {
        usuarioServiceBeanLocal.guardarUsuario(usuarioDto);
    }
    
    public void listarRegistrosByUsuario(ActionEvent actionEvent){
        registroServiceBeanLocal.findByUsuario("1");
    }
    
    public static void  listarUsuarios(){
       
    }   

    public UsuarioDto getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(UsuarioDto usuarioDto) {
        this.usuarioDto = usuarioDto;
    }   
}

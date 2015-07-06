/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio.usuario;

import com.making.scm.dto.UsuarioDto;
import javax.ejb.Local;

/**
 *
 * @author Your Name
 */
@Local
public interface UsuarioServiceBeanLocal {
    
    public void guardarUsuario(UsuarioDto usuarioDto);
    public void modificarUsuario(UsuarioDto UsuarioDto);
    public void eliminarUsuario(UsuarioDto UsuarioDto);
    public void consultarUsuario(UsuarioDto UsuarioDto);
    
    
}

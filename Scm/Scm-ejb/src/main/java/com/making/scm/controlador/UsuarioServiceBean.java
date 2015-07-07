/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.controlador;

import com.making.scm.accesoDatos.UsuarioDal;
import com.making.scm.accesoDatos.mappers.UsuarioMapper;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.persistencia.Usuario;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Your Name
 */
@Stateless
public class UsuarioServiceBean implements UsuarioServiceBeanLocal {
@EJB
private UsuarioDal usuarioDal;
    
    @Override
    public void guardarUsuario(UsuarioDto usuarioDto ) {
        usuarioDal.create((Usuario) new UsuarioMapper().dtoToEntity(usuarioDto));
    }

    @Override
    public void modificarUsuario(UsuarioDto usuarioDto) {
        usuarioDal.edit((Usuario) new UsuarioMapper().dtoToEntity(usuarioDto));
    }

    @Override
    public void eliminarUsuario(UsuarioDto usuarioDto) {
          usuarioDal.remove((Usuario) new UsuarioMapper().dtoToEntity(usuarioDto));
    }

    @Override
    public void consultarUsuario(UsuarioDto usuarioDto) {
            usuarioDal.find((Usuario) new UsuarioMapper().dtoToEntity(usuarioDto));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

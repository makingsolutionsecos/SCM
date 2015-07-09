/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos.mappers;

import com.making.scm.accesoDatos.UsuarioDal;
import com.making.scm.dto.Dto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Usuario;
import com.making.scm.utilidades.Util;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Camilo Marroquin
 */
public class UsuarioMapper implements IMapper {

    @EJB
    private UsuarioDal usuarioDal;

    @Override
    public Dto entityToDto(EntityObject entityObject) {
        Usuario entity = (Usuario) entityObject;

        UsuarioDto usuarioDto = new UsuarioDto();

        usuarioDto.setId(entity.getIdUsuario());
        usuarioDto.setNombres(entity.getNombreUsuario());
        usuarioDto.setFechaNacimiento(entity.getFechaNacimiento());
        usuarioDto.setGenero(Util.getEnumGenero(entity.getGenero()));
        usuarioDto.setNumeroTelefono(entity.getNumeroTelefono());
        usuarioDto.setNumeroIdentificacion(entity.getNumeroIdentificacion());
        usuarioDto.setApellidos(entity.getApellidoUsuario());
        usuarioDto.setDireccion(entity.getDireccion());
        usuarioDto.setCorreo(entity.getCorreo());
        usuarioDto.setContrasena(entity.getContrasena());
        usuarioDto.setIdCloud(entity.getIdCloud());
        usuarioDto.setRol(null);

        return usuarioDto;

        //nombre_usuario			
        //fecha_nacimiento			
        //genero			
        //numero_telefono			
        //numero_identificacion			
        //id_usuario			
        //apellido_usuario			
        //direccion			
        //correo			
        //contrasena			
        //id_cloud			
        //id_rol
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        Usuario usuario = null;
        try {
            UsuarioDal usuarioDalInject = (UsuarioDal) new InitialContext().lookup("java:global/scm-ear/scm-ejb-1.0/UsuarioDal");

            UsuarioDto usuarioDto = (UsuarioDto) dto;
            usuario = usuarioDalInject.find(usuarioDto.getId());
        } catch (NamingException e) {
            throw new EJBException(e);
        }
        return usuario;
    }
}

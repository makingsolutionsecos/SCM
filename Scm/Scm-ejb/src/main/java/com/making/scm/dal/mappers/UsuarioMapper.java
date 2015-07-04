/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dal.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Usuario;

/**
 *
 * @author Camilo Marroquin
 */
public class UsuarioMapper implements IMapper {

    @Override
    public Dto entityToDto(EntityObject entityObject) {
        Usuario entity = (Usuario) entityObject;

        UsuarioDto usuarioDto = new UsuarioDto();

        usuarioDto.setId(entity.getIdUsuario());
        usuarioDto.setNombres(entity.getNombreUsuario());
        usuarioDto.setApellidos(entity.getApellidoUsuario());
        usuarioDto.setNumeroIdentificacion(entity.getNumeroIdentificacion());
        
        return usuarioDto;
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        UsuarioDto usuarioDto = (UsuarioDto) dto;      
        
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(Long.MIN_VALUE);
        usuario.setNombreUsuario(null);
        usuario.setApellidoUsuario(null);
        usuario.setNumeroIdentificacion(null);
        
        return usuario;
    }
}

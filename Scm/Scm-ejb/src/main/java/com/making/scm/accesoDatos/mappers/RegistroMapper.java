/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.dto.RegistroDto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Registro;
import com.making.scm.persistencia.Usuario;

/**
 *
 * @author Camilo Marroquin
 */
public class RegistroMapper implements IMapper {
    
    

    @Override
    public Dto entityToDto(EntityObject entityObject) {        
        Registro registro = (Registro) entityObject;
        
        UsuarioMapper usuarioMapper = new UsuarioMapper();
        
        RegistroDto registroDto = new RegistroDto();
        registroDto.setId(registro.getIdRegistro());
        registroDto.setFecha(registro.getFechaRegistro());
        registroDto.setUsuario((UsuarioDto) usuarioMapper.entityToDto(registro.getIdUsuario()));
        
        return registroDto;
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        RegistroDto registroDto = (RegistroDto) dto;        
        Registro registro = new Registro();
//        registro.setAudioList(null);
//        registro.setFechaRegistro(registroDto.getFecha());
        registro.setIdRegistro(registroDto.getId());
//        UsuarioMapper usuarioMapper = new UsuarioMapper();
//        registro.setIdUsuario((Usuario) usuarioMapper.dtoToEntity(registroDto.getUsuario()));
//        registro.setRespuestaConocimientoList(null);
//        registro.setRespuestaRegistroList(null);
        return registro;
    }

}

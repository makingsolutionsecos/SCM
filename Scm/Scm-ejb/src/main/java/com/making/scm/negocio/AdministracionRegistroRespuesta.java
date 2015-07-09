/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.accesoDatos.RespuestaRegistroDal;
import com.making.scm.accesoDatos.mappers.RespuestaRegistroMapper;
import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.persistencia.RespuestaRegistro;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class AdministracionRegistroRespuesta {

    @EJB
    private RespuestaRegistroDal respuestaRegistroDal;

    public AdministracionRegistroRespuesta() {
    }

    public void guardarRegistroRespuestaCLiente(RegistroRespuestaDto registroRespuestaDto) {
        if (registroRespuestaDto.getHashCode() != 0 && registroRespuestaDto.getHashCode() == registroRespuestaDto.hashCode()) {
            RespuestaRegistroMapper respuestaRegistroMapper = new RespuestaRegistroMapper();
            respuestaRegistroDal.edit((RespuestaRegistro) respuestaRegistroMapper.dtoToEntity(registroRespuestaDto));
        }

    }

}

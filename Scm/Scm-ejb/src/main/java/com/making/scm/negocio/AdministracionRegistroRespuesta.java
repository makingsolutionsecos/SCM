/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.dal.mappers.RespuestaRegistroMapper;
import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.dal.RespuestaRegistroDal;
import com.making.scm.persistencia.RespuestaRegistro;
import javax.ejb.EJB;

/**
 *
 * @author Usuario
 */
public class AdministracionRegistroRespuesta {

    @EJB
    private RespuestaRegistroDal respuestaRegistroFacade;

    public AdministracionRegistroRespuesta() {
    }

    public void guardarRegistroRespuestaCLiente(RegistroRespuestaDto registroRespuestaDto) {

        RespuestaRegistroMapper respuestaRegistroMapper = new RespuestaRegistroMapper();

        respuestaRegistroFacade.edit((RespuestaRegistro) respuestaRegistroMapper.dtoToEntity(registroRespuestaDto));

    }

}

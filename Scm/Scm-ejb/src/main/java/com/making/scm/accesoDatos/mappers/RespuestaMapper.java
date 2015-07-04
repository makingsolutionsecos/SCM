/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.dto.PreguntaDto;
import com.making.scm.dto.RespuestaDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Respuesta;

/**
 *
 * @author Camilo Marroquin
 */
public class RespuestaMapper implements IMapper {

    @Override
    public Dto entityToDto(EntityObject entityObject) {
        Respuesta respuesta = (Respuesta) entityObject;
        PreguntaMapper preguntaMapper = new PreguntaMapper();
        RespuestaDto respuestaDto = new RespuestaDto();
        respuestaDto.setId(respuesta.getIdRespuesta());
        respuestaDto.setPregunta((PreguntaDto) preguntaMapper.entityToDto(respuesta.getIdPregunta()));
        respuestaDto.setRespuesta(respuesta.getRespuesta());
        
        return respuestaDto;
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

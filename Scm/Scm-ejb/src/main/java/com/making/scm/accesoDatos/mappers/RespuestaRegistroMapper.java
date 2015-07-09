/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.dto.PreguntaDto;
import com.making.scm.dto.RegistroDto;
import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.dto.RespuestaDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Pregunta;
import com.making.scm.persistencia.Registro;
import com.making.scm.persistencia.Respuesta;
import com.making.scm.persistencia.RespuestaRegistro;

/**
 *
 * @author Usuario
 */
public class RespuestaRegistroMapper implements IMapper {

    @Override
    public Dto entityToDto(EntityObject entityObject) {
        RespuestaRegistro entity = (RespuestaRegistro) entityObject;
        
        RegistroMapper registroMapper = new RegistroMapper();
        RespuestaMapper respuestaMapper = new RespuestaMapper();
        PreguntaMapper preguntaMapper = new PreguntaMapper();
        RegistroRespuestaDto registroRespuestaDto = new RegistroRespuestaDto();
        registroRespuestaDto.setId(entity.getIdRegistroRespuesta());
        registroRespuestaDto.setRegistro((RegistroDto) registroMapper.entityToDto(entity.getIdRegistro()));
        registroRespuestaDto.setRespuesta((RespuestaDto) respuestaMapper.entityToDto(entity.getIdRespuesta()));
        registroRespuestaDto.setTexto(entity.getTextoOtro());
        registroRespuestaDto.setPregunta((PreguntaDto) preguntaMapper.entityToDto(entity.getIdPregunta()));

        return registroRespuestaDto;
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        RegistroRespuestaDto registroRespuestaDto = (RegistroRespuestaDto) dto;
        RespuestaRegistro respuestaRegistro = new RespuestaRegistro();
        respuestaRegistro.setIdRegistroRespuesta(registroRespuestaDto.getId());
        RegistroMapper registroMapper = new RegistroMapper();
        respuestaRegistro.setIdRegistro((Registro) registroMapper.dtoToEntity(registroRespuestaDto.getRegistro()));
        RespuestaMapper respuestaMapper = new RespuestaMapper();
        respuestaRegistro.setIdRespuesta((Respuesta) respuestaMapper.dtoToEntity(registroRespuestaDto.getRespuesta()));
        PreguntaMapper preguntaMapper = new PreguntaMapper();
        respuestaRegistro.setIdPregunta((Pregunta) preguntaMapper.dtoToEntity(registroRespuestaDto.getPregunta()));
        respuestaRegistro.setTextoOtro(registroRespuestaDto.getTexto());
        return respuestaRegistro;
    }

}

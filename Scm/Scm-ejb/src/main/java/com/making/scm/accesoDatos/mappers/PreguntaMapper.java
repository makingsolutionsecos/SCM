/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.dto.PreguntaDto;
import com.making.scm.persistencia.EntityObject;
import com.making.scm.persistencia.Pregunta;

/**
 *
 * @author Camilo Marroquin
 */
public class PreguntaMapper implements IMapper {

    @Override
    public Dto entityToDto(EntityObject entityObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntityObject dtoToEntity(Dto dto) {
        
        PreguntaDto preguntaDto = (PreguntaDto) dto;
        Pregunta pregunta = new Pregunta();
        pregunta.setIdPregunta(preguntaDto.getId());
        pregunta.setPregunta(preguntaDto.getPregunta());
        
        return pregunta;
    }
}

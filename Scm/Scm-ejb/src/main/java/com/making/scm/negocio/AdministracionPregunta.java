/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.accesoDatos.PreguntaDal;
import com.making.scm.accesoDatos.mappers.PreguntaMapper;
import com.making.scm.dto.PreguntaDto;
import com.making.scm.persistencia.Pregunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sforerop
 */
public class AdministracionPregunta {

    public AdministracionPregunta() {

    }

    public boolean crearPregunta(PreguntaDto pregunta) {
        return false;
    }

    public PreguntaDto obtenerPregunta(long idPregunta) {
        
        
        PreguntaDto pregunta = new PreguntaDto();
        return pregunta;
    }

    public PreguntaDto actualizarPregunta(PreguntaDto preguntaMod) {
        PreguntaDto pregunta = new PreguntaDto();
        return pregunta;
    }
    
    public List<PreguntaDto> obtenerPreguntas(){
        List<PreguntaDto> listaPreguntas = new ArrayList<PreguntaDto>();
        PreguntaDal preguntaDal = new PreguntaDal();
        
        //Lista todos lo elementos de la base de datos
        List<Pregunta> listaPreguntasDB = preguntaDal.findAll();
        
        //Mapper de la entidad
        PreguntaMapper preguntaMapper = new PreguntaMapper();
        
        //Mapea cada elemento de la lista
        for(Pregunta  pregunta: listaPreguntasDB){
            listaPreguntas.add((PreguntaDto)preguntaMapper.entityToDto(pregunta));
        }
        
        //Retorna la lista
        return listaPreguntas;
    }
    
    
}

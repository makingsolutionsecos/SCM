/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.bl;

import com.making.scm.dto.PreguntaDto;
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
        return listaPreguntas;
    }
    
    
}

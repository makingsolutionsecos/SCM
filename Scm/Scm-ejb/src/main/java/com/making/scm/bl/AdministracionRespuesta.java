/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.bl;

import com.making.scm.dto.RespuestaDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sforerop
 */
public class AdministracionRespuesta {
    
    
    public boolean crearRespuesta(RespuestaDto respuesta) {
        return false;
    }

    public RespuestaDto obtenerRespuesta(long idPregunta) {
        RespuestaDto respuesta = new RespuestaDto();
        return respuesta;
    }

    public RespuestaDto actualizarRespuesta(RespuestaDto respuestaMod) {
        RespuestaDto respuesta = new RespuestaDto();
        return respuesta;
    }
    
    public List<RespuestaDto> obtenerRespuestasPorPregunta(){
        List<RespuestaDto> listaPreguntas = new ArrayList<RespuestaDto>();
        return listaPreguntas;
    }
    
}

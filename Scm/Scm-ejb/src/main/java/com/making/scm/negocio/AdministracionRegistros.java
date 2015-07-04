/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.dal.mappers.RespuestaRegistroMapper;
import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.fachada.RespuestaRegistroFacade;
import com.making.scm.persistencia.RespuestaRegistro;
import javax.ejb.EJB;

/**
 *
 * @author jorgealfonsobeltran
 */
public class AdministracionRegistros {
    
    @EJB
    private RespuestaRegistroFacade respuestaRegistroFacade;
            
    public AdministracionRegistros() {
    }
    
    
   public void guardarRegistroRespuestaCLiente(RegistroRespuestaDto registroRespuestaDto){
       
       RespuestaRegistroMapper respuestaRegistroMapper = new RespuestaRegistroMapper();
       
       respuestaRegistroFacade.edit((RespuestaRegistro)respuestaRegistroMapper.dtoToEntity(registroRespuestaDto));
       
   }
    
}

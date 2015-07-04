/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.fachada.RespuestaRegistroFacade;
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
       
//       respuestaRegistroFacade.edit(registroRespuestaDto);
       
   }
    
}

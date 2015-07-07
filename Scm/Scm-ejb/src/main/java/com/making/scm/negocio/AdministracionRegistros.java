/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.negocio;

import com.making.scm.accesoDatos.RegistroDal;
import com.making.scm.accesoDatos.mappers.RegistroMapper;
import com.making.scm.dto.RegistroDto;
import com.making.scm.persistencia.Registro;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jorgealfonsobeltran
 */

public class AdministracionRegistros {

    @EJB 
    RegistroDal  registroDal;
            
    public AdministracionRegistros() {
    }
    
    
        public List<RegistroDto> findByUsuario(String usuarioId) {
        
        List<RegistroDto> ListaRegistro = new ArrayList<RegistroDto>();
        
        List<Registro> listaRegistroDB = registroDal.findByUsuario(usuarioId);
        
        //Mapper de la entidad
        RegistroMapper registroMapper = new RegistroMapper();
        
        //Mapea cada elemento de la lista
        for(Registro  registro: listaRegistroDB){
            ListaRegistro.add((RegistroDto)registroMapper.entityToDto(registro));
        }
        
        return ListaRegistro;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.controlador;

import com.making.scm.accesoDatos.RegistroDal;
import com.making.scm.dto.RegistroDto;
import com.making.scm.negocio.AdministracionRegistros;
import java.util.List;

/**
 *
 * @author Camilo Marroquin
 */
public class RegistroServiceBean implements RegistroServiceBeanLocal{

    @Override
    public List<RegistroDto> findByUsuario(String usuarioId) {
        AdministracionRegistros administracionRegistros = new AdministracionRegistros();
        
        return administracionRegistros.findByUsuario(usuarioId);
        
    }
    
}

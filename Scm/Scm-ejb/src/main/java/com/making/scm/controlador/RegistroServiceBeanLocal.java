/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.controlador;

import com.making.scm.dto.RegistroDto;
import java.util.List;

/**
 *
 * @author Camilo Marroquin
 */
public interface RegistroServiceBeanLocal {
    public List<RegistroDto> findByUsuario(String usuarioId);  
}

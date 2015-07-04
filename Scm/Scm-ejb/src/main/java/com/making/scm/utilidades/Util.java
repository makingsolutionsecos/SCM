/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.utilidades;

import com.making.scm.enumeracion.GeneroEnum;

/**
 *
 * @author Camilo Marroquin
 */
public class Util {
    
    public static GeneroEnum getEnumGenero(String stringGenero){
        if (stringGenero != null || stringGenero.isEmpty() ) {
            if (stringGenero == GeneroEnum.MUJER.toString()) {
                return GeneroEnum.MUJER;
            }
            else {
                return GeneroEnum.HOMBRE;
            }
        }
        return GeneroEnum.HOMBRE;
    }
}

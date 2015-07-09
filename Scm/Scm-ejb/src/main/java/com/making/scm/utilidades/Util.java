/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.utilidades;

import com.making.scm.enumeracion.GeneroEnum;
import java.util.List;
import javax.persistence.TypedQuery;

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
    
    public static <T> T getSingleResult(TypedQuery<T> query) {
    query.setMaxResults(1);
    List<T> list = query.getResultList();
    if (list == null || list.isEmpty()) {
        return null;
    }

    return list.get(0);
}
}

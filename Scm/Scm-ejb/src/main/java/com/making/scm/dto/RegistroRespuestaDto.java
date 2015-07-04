package com.making.scm.dto;

import java.util.List;

/**
 * clase que representa el registro de una respuesta del usuario
 *
 * @author jorgealfonsobeltran
 */
public class RegistroRespuestaDto {
    
    /**
     * Identificador unico del registro de la respuesta ingresada por el usuario
     */
    private int id;
    
    /**
     * Registro asociado a la respuesta del usuario
     */
    private RegistroDto registro;
    
    /**
     * Opcion de respuesta asociada al registro del ingreso de la respuesta del usuario
     */
    private List<RespuestaDto> respuesta;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the registro
     */
    public RegistroDto getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(RegistroDto registro) {
        this.registro = registro;
    }
}

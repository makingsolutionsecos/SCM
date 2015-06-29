package com.making.scm.dto;

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
    private RespuestaDto respuesta;
    
    /**
     * Pregunta asociada a la respuesta ingresada por el usuario
     */
    private PreguntaDto pregunta;
    
    /**
     * Testo de la respuesta igresada por el usuario en caaso que no se encuentre en las opciones de respuesta
     */
    private String texto;
}

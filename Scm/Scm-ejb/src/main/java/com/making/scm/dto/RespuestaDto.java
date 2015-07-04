package com.making.scm.dto;

/**
 * clase que representa una opcion de respuesta cargada en el sistema
 *
 * @author jorgealfonsobeltran
 */
public class RespuestaDto extends Dto{
    
    /**
     * Identificador de la regunta
     */
    private int id;
    
    /**
     * Pregunta preunta a la que la respuesta se encuentra relacionada
     */
    private PreguntaDto pregunta;
    
    /**
     * Texto de la respuesta
     */
    private String respuesta;

    /**
     * Texto de la respuesta
     */
    private String respuestaTexto;

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
     * @return the pregunta
     */
    public PreguntaDto getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(PreguntaDto pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
}

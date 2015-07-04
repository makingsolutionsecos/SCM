package com.making.scm.dto;

import java.util.List;

/**
<<<<<<< Updated upstream
 * Clase que representa una pregunta del sistema
 * 
 * @author jorgealfonsobeltran
=======
 *
 * @author Camilo Marroquin
>>>>>>> Stashed changes
 */
public class PreguntaDto extends Dto{
    
    /**
     * Identificador unico de la pregunta
     */
    private Long id;
    
    /**
     * Contenido de la pregunta
     */
    private String pregunta; 

    /**
     * Respuestas relacionadas a la pregunta
     */
    private List<RespuestaDto> respuestas;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuestas
     */
    public List<RespuestaDto> getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(List<RespuestaDto> respuestas) {
        this.respuestas = respuestas;
    }

}

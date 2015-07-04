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
     * Texto de la respuesta igresada por el usuario en caaso que no se encuentre en las opciones de respuesta
     */
    private String texto;

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

    /**
     * @return the respuesta
     */
    public RespuestaDto getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(RespuestaDto respuesta) {
        this.respuesta = respuesta;
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
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
}

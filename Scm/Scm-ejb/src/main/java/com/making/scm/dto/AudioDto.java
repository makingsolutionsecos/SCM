/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dto;

/**
 * clase que representa representa un audio del sistema
 * 
 * @author jorgealfonsobeltran
 */
public class AudioDto {
    
    /**
     * Identificador unico del audio
     */
    private int id;
    
    /**
     * Registro asociado al ingreso de audio
     */
    private RegistroDto registro;
    
    /**
     * Cadan de caracteres que representa la cadena de audio en base 64
     */
    private String audio;

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
     * @return the audio
     */
    public String getAudio() {
        return audio;
    }

    /**
     * @param audio the audio to set
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }
}

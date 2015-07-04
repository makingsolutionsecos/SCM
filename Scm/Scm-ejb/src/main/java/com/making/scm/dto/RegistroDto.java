package com.making.scm.dto;

import java.util.Date;

/**
 * Clase que representa un registro de sLongomas en el sistema
 *
 * @author jorgealfonsobeltran
 */
public class RegistroDto extends Dto{
    
    /**
     * Identificador unico del registro
     */
    private Long id;
    
    /**
     * Fecha en la que se realiza el registro 
     */
    private Date fecha;
    
    /**
     * Identificador del usuario que realizá el registro
     */
    private UsuarioDto usuario;

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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the usuario
     */
    public UsuarioDto getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }
    
}

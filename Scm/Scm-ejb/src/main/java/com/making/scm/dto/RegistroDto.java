package com.making.scm.dto;

import java.util.Date;

/**
 * Clase que representa un registro de sintomas en el sistema
 *
 * @author jorgealfonsobeltran
 */
public class RegistroDto {
    
    /**
     * Identificador unico del registro
     */
    private int Id;
    
    /**
     * Identificador del usuario que realizá el registro
     */
    private int IdUsuario;
    
    /**
     * Fecha en la que se realiza el registro 
     */
    private Date fecha;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the IdUsuario
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario the IdUsuario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
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
    
}

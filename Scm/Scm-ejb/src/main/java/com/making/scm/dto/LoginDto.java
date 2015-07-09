package com.making.scm.dto;

import java.util.Objects;

/**
 *
 * @author sforerop
 */
public class LoginDto {

    /**
     * nombre de usuario para iniciar session
     */
    private String nombreUsuario;

    /**
     * Contraseña del usuario para iniciar session
     */
    private String contraseniaUsuario;

    /**
     * Códigio hash
     */
    private int codigoHash;

    /**
     * get nombre de usuaro
     *
     * @return String nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Set nombre de usuario
     *
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * get contraseña usuario
     *
     * @return
     */
    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    /**
     * set contraseña usuario
     *
     * @param contraseniaUsuario
     */
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.contraseniaUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoginDto other = (LoginDto) obj;
        return true;
    }

    /**
     * @return the hashCode
     */
    public int getCodigoHash() {
        return codigoHash;
    }

    /**
     * @param codigoHash the hashCode to set
     */
    public void setCodigoHash(int codigoHash) {
        this.codigoHash = codigoHash;
    }
}

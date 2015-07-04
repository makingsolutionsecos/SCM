package com.making.scm.dto;

import com.making.scm.enumeracion.SexoEnum;
import java.util.Date;

/**
 * Clase que reprensta un usuario del sistema (Doctores y Pacientes).
 *
 * @author camilomarroquin
 */
public class UsuarioDto extends Dto{

    /**
     * Obtiene o establece el identificador único del usuario del sistema.
     */
    private Long id;

    /**
     * Obtiene o establece la identificación del usuario.
     */
    private String numeroIdentificacion;

    /**
     * Obtiene o establece los apellidos del usuario.
     */
    private String apellidos;

    /**
     * Obtiene o establece los nombres del usuarios
     */
    private String nombres;

    /**
     * Obtiene o establece la fecha de nacimiento del usuario.
     */
    private Date fechaNacimiento;

    /**
     * Obtiene o establece la dirección de residencia del usuario.
     */
    private String direccion;

    /**
     * Obiene o establece los teléfonos del contacto.
     */
    private String telefonos;

    /**
     * Obtiene o establece el correo electrónico. Usado para loguearse al
     * sistema.
     */
    private String correoElectronico;

    /**
     * Obtiene o establece la clave de acceso al sistema.
     */
    private String clave;

    /**
     * Obtiene o establece la identificación del cloud para móviles.
     */
    private String idCloud;

    /**
     * Obtiene o establece el rol del usuario.
     */
    private RolDto rol;

    /**
     * Obtiene o establece el sexo del usuario.
     */
    private SexoEnum sexo;

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
     * @return the numeroIdentificacion
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * @param numeroIdentificacion the numeroIdentificacion to set
     */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefonos
     */
    public String getTelefonos() {
        return telefonos;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the idCloud
     */
    public String getIdCloud() {
        return idCloud;
    }

    /**
     * @param idCloud the idCloud to set
     */
    public void setIdCloud(String idCloud) {
        this.idCloud = idCloud;
    }

    /**
     * @return the rol
     */
    public RolDto getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(RolDto rol) {
        this.rol = rol;
    }

    /**
     * @return the sexo
     */
    public SexoEnum getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }
}

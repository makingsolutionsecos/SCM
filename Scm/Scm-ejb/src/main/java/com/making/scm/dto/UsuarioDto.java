package com.making.scm.dto;

import com.making.scm.enumeracion.GeneroEnum;
import java.util.Date;

/**
 * Clase que reprensta un usuario del sistema (Doctores y Pacientes).
 *
 * @author camilomarroquin
 */
public class UsuarioDto extends Dto{
    
    //nombre_usuario			
    //fecha_nacimiento			
    //genero			
    //numero_telefono			
    //numero_identificacion			
    //id_usuario			
    //apellido_usuario			
    //direccion			
    //telefono			
    //correo			
    //contrasena			
    //id_cloud			
    //id_rol

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
    private String numeroTelefono;

    /**
     * Obtiene o establece el correo electrónico. Usado para loguearse al
     * sistema.
     */
    private String correo;

    /**
     * Obtiene o establece la contrasena de acceso al sistema.
     */
    private String contrasena;

    /**
     * Obtiene o establece la identificación del cloud para móviles.
     */
    private String idCloud;

    /**
     * Obtiene o establece el rol del usuario.
     */
    private RolDto rol;

    /**
     * Obtiene o establece el genero del usuario.
     */
    private GeneroEnum genero;

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
     * @return the numeroTelefono
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
     * @return the genero
     */
    public GeneroEnum getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }
}

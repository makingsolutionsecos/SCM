package com.making.scm.dto;

import com.making.scm.enumeration.SexoEnum;
import java.util.Date;

/**
 * Clase que reprensta un usuario del sistema (Doctores y Pacientes).
 *
 * @author camilomarroquin
 */
public class UsuarioDto {

    /**
     * Obtiene o establece el identificador único del usuario del sistema.
     */
    private int id;

    /**
     * Obtiene o establece la identificación del usuario.
     */
    private String identificacion;

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
}

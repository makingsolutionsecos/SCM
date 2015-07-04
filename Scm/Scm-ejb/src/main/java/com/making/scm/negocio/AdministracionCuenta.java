package com.making.scm.negocio;

import com.making.scm.dto.UsuarioDto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que interactúa con la administración de usuarios del sistema (Doctores
 * y pacientes).
 *
 * @author Jimmy
 */
public class AdministracionCuenta {

    /**
     * Método para insertar un usuario en el sistema.
     *
     * @param usuario a insertar
     * @return cantidad de registros insertados.
     */
    public int insertarUsuario(UsuarioDto usuario) {
        return 0;
    }

    /**
     * Método para obtener un usuario por identificación.
     *
     * @param identificacion del usuario para realizaer el filtro.
     * @return
     */
    public UsuarioDto obtenerUsuarioPorIdentificacion(String identificacion) {
        UsuarioDto usuario = null;

        return usuario;
    }

    /**
     * Método para obtener un usuario por correo.
     *
     * @param correoElectroncio para ejecutar el filtro de usuarios.
     * @return
     */
    public UsuarioDto obtenerUsuarioPorCorreo(String correoElectroncio) {
        UsuarioDto usuario = null;

        return usuario;
    }

    /**
     * Método para obtener los uauraios del sistema.
     *
     * @return
     */
    public List<UsuarioDto> obtenerUsuarios() {
        List<UsuarioDto> usuarios = new ArrayList<UsuarioDto>();
        return usuarios;
    }

    /**
     * Método para actualizar un usuario en el sistema.
     *
     * @param usuario a acturalizar.
     * @return verdadero si la operación se hizo, de lo contrario falso.
     */
    public boolean actualizarUsuario(UsuarioDto usuario) {
        return true;
    }

}

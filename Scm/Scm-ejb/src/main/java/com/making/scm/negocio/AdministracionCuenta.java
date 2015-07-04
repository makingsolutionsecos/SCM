package com.making.scm.negocio;

import com.making.scm.accesoDatos.UsuarioDal;
import com.making.scm.accesoDatos.mappers.UsuarioMapper;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.persistencia.Usuario;
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
       List<UsuarioDto> listaUsuarios = new ArrayList<UsuarioDto>();
        UsuarioDal usuarioDal = new UsuarioDal();
        
        //Lista todos lo elementos de la base de datos
        List<Usuario> listaUsuariosDB = usuarioDal.findAll();
        
        //Mapper de la entidad
        UsuarioMapper usuarioMapper = new UsuarioMapper();
        
        //Mapea cada elemento de la lista
        for(Usuario  usuario: listaUsuariosDB){
            listaUsuarios.add((UsuarioDto)usuarioMapper.entityToDto(usuario));
        }
        
        //Retorna la lista
        return listaUsuarios;
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

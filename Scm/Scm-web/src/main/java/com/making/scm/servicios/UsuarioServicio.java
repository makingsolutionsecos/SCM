package com.making.scm.servicios;

import com.making.scm.dto.LoginDto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.negocio.AdministracionCuenta;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author G40
 */
@Path("usuario")
public class UsuarioServicio {

    @Context
    private UriInfo context;

    @EJB
    private AdministracionCuenta administracionCuenta;

    /**
     * Creates a new instance of UsuarioServicio
     */
    public UsuarioServicio() {
    }

    /**
     * Retrieves representation of an instance of
     * com.making.scm.servicios.UsuarioServicio
     *
     * @param id
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("identificacion/{identificacion}")
    public UsuarioDto getJson(@PathParam("identificacion") int id) {
        //TODO return proper representation object
//        List<UsuarioDto> usuario = new ArrayList<UsuarioDto>();
        UsuarioDto usuario = new UsuarioDto();
//        usuario=administracionCuenta.obtenerUsuarios();
        usuario = administracionCuenta.obtenerUsuarioPorIdentificacion(Integer.toString(id));
        return usuario;
    }

    /**
     * Método que permite autenticar un usuario.
     *
     * @param login Objeto que debe contener la identificación y la clave.
     * @return UsuarioDto si es autenticado.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("autenticacion/")
    public Response  postUsuarioAutenticado(LoginDto login) {
        System.out.println(login.getContraseniaUsuario());
        UsuarioDto usuario;
        usuario = administracionCuenta.autenticarUsuario(login);
        return Response.status(200).build();
    }

    /**
     * PUT method for updating or creating an instance of UsuarioServicio
     *
     */
    @PUT
    @Consumes("application/json")
    public void putJson(UsuarioDto usuario) {
        System.out.println(usuario.getNombres());
    }
}

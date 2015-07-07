/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.servicios;

import com.making.scm.dto.UsuarioDto;
import com.making.scm.negocio.AdministracionCuenta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

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
     * PUT method for updating or creating an instance of UsuarioServicio
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(UsuarioDto usuario) {
        System.out.println(usuario.getNombres());
    }
}

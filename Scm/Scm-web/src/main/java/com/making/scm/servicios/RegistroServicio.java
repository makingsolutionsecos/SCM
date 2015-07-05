/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.servicios;

import com.making.scm.dto.RegistroDto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.negocio.AdministracionCuenta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author G40
 */
@Path("registros")
public class RegistroServicio {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RegistroServicio
     */
    public RegistroServicio() {
    }

    /**
     * Retrieves representation of an instance of com.making.scm.manageBeans.RegistroServicio
     * @return an instance of com.making.scm.dto.RegistroDto
     */
    @GET
    @Produces("application/json")
    public RegistroDto getJson() {
        Date now=new Date();
        //TODO return proper representation object
        RegistroDto registro=new RegistroDto();
        List<UsuarioDto> usuario=new ArrayList<UsuarioDto>();
        registro.setFecha(now);
        registro.setId(Long.valueOf(1));
        AdministracionCuenta administracionCuenta=new AdministracionCuenta();
        usuario=administracionCuenta.obtenerUsuarios();
        registro.setUsuario(usuario.get(1));
        return registro;
    }

    /**
     * PUT method for updating or creating an instance of RegistroServicio
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(RegistroDto content) {
    }
    
    
    /**
     * POST method for creating an instance of RegistroServicio
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    public void postJson(RegistroDto content) {
        
    }
}

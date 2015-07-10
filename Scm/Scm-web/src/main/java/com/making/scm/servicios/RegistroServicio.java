/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.servicios;

import com.making.scm.dto.PreguntaDto;
import com.making.scm.dto.RegistroDto;
import com.making.scm.dto.RegistroRespuestaDto;
import com.making.scm.dto.RespuestaDto;
import com.making.scm.dto.RolDto;
import com.making.scm.dto.UsuarioDto;
import com.making.scm.enumeracion.GeneroEnum;
import com.making.scm.negocio.AdministracionCuenta;
import com.making.scm.negocio.AdministracionRegistroRespuesta;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
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
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author G40
 */
@Path("registros")
public class RegistroServicio {

    @Context
    private UriInfo context;

    @EJB
    private AdministracionRegistroRespuesta administracionRegistroRespuesta;

    /**
     * Creates a new instance of RegistroServicio
     */
    public RegistroServicio() {
    }


    /**
     * PUT method for updating or creating an instance of RegistroServicio
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(RegistroDto content) {
    }

    /**
     * POST method for creating an instance of RegistroServicio
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    public Response postJson(List<RegistroRespuestaDto> registroRespuestaDtos) throws ParseException {
        administracionRegistroRespuesta.guardarRegistroRespuestaCLiente(registroRespuestaDtos);
        return Response.status(200).build();
    }

    @GET
    @Produces("application/json")
    @Path("getRegistro")
    public RegistroRespuestaDto getJson2() {
        RegistroRespuestaDto registroRespuestaDto = new RegistroRespuestaDto();
        registroRespuestaDto.setId(1L);
        RegistroDto reg = new RegistroDto();
        reg.setId(1L);
        reg.setFecha(new Date());
        UsuarioDto usr = new UsuarioDto();
        usr.setApellidos("forero");
        usr.setNombres("sergio");
        usr.setContrasena("12345");
        usr.setCorreo("correo@gmail.com");
        usr.setDireccion("cll 123");
        usr.setFechaNacimiento(new Date());
        usr.setGenero(GeneroEnum.HOMBRE);
        usr.setId(1L);
        usr.setIdCloud("1");
        usr.setNumeroIdentificacion("1016154223");
        usr.setNumeroTelefono("827365");
        RolDto rol = new RolDto();
        rol.setId(1);
        rol.setNombre("admin");
        usr.setRol(rol);
        reg.setUsuario(usr);
        registroRespuestaDto.setRegistro(reg);
        RespuestaDto resp = new RespuestaDto();
        resp.setId(1L);
        resp.setRespuesta("respuesta1");
        PreguntaDto preg1 = new PreguntaDto();
        preg1.setId(1L);
        preg1.setPregunta("pregunta1");
        preg1.setRespuestas(null);
        resp.setPregunta(preg1);
        registroRespuestaDto.setRespuesta(resp);
        PreguntaDto preg2 = new PreguntaDto();
        preg2.setId(2L);
        preg2.setPregunta("pregunta2");
        preg2.setRespuestas(null);
        registroRespuestaDto.setPregunta(preg2);
        registroRespuestaDto.setTexto("texto");
        registroRespuestaDto.setHashCode(01234567);
        return registroRespuestaDto;
    }
}

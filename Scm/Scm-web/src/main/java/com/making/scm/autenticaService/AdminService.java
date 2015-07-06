/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.autenticaService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/administration")
@Produces("text/html")
public class AdminService {

    @GET
    public Response getPageAdmin() {
        int status = 200;
        String html = "<html lang=\\\"en\\\"><body><form action=\"administrar\" method=\"post\"><center><table><tr><td><br/><br/><br/><br/><br/><br/><br/>"
                + "<h2>Bienvenido Administrador a</h2><br/> <h1><div style=\"color: orange;\">SCM - SISTEMA DE CONTROL DE MIGRA&Ntilde;A</div></h1><br/><br/><br/><br/>"
                + "<br/><br/></td></tr><table></center><br/>"
                + "<center><input type=\"submit\" value=\"Continuar\"></center></form></body></html>";
        return Response.status(status).header("Access-Control-Allow-Origin", "*").entity(html).build();
    }
}



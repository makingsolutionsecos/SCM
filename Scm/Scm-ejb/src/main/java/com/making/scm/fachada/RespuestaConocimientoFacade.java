/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.fachada;

import com.making.scm.persistencia.RespuestaConocimiento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class RespuestaConocimientoFacade extends AbstractFacade<RespuestaConocimiento> {
    @PersistenceContext(unitName = "com.making-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestaConocimientoFacade() {
        super(RespuestaConocimiento.class);
    }
    
}

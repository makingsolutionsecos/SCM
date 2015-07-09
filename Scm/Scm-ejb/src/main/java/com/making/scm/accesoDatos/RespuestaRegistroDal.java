/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos;

import com.making.scm.persistencia.RespuestaRegistro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class RespuestaRegistroDal extends AbstractDal<RespuestaRegistro> {

    @PersistenceContext(unitName = "com.making-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestaRegistroDal() {
        super(RespuestaRegistro.class);
    }

    public List<RespuestaRegistro> findByIdRegistro(Long registroId) {
        Query query = em.createNamedQuery("RespuestaRegistro.findByIdRegistro" , RespuestaRegistro.class);
        query.setParameter("idRegistro", registroId);
        return query.getResultList();
    }
}

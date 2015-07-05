/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos;

import com.making.scm.persistencia.Registro;
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
public class RegistroDal extends AbstractDal<Registro> {
    @PersistenceContext(unitName = "com.making-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroDal() {
        super(Registro.class);
    }
    
    public List<Registro> findByUsuario(String numeroId) {
        Query query = em.createNamedQuery("findByNumeroIdentificacion");
        query.setParameter("numeroIdentificacion", numeroId);
        return (Usuario) query.getSingleResult();
    }
}

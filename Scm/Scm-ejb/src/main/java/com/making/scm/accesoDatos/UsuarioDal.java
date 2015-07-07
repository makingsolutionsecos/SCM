/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.accesoDatos;

import com.making.scm.persistencia.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class UsuarioDal extends AbstractDal<Usuario> {

    @PersistenceContext(unitName = "com.making-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDal() {
        super(Usuario.class);
    }
    
  /**
   * Busca usuario por la identificación
   * @param numeroIdentificacion
   * @return Usuario
   */  
    public Usuario findByIdentificacion(String numeroIdentificacion) {
        Query query = em.createNamedQuery("Usuario.findByNumeroIdentificacion", Usuario.class);
        query.setParameter("numeroIdentificacion", numeroIdentificacion);
        return (Usuario) query.getSingleResult();
    }
}

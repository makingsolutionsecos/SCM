package com.making.scm.accesoDatos;

import com.making.scm.persistencia.Usuario;
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
     *
     * @param numeroIdentificacion
     * @return Usuario
     */
    public Usuario findByIdentificacion(String numeroIdentificacion) {
        Query query = em.createNamedQuery("Usuario.findByNumeroIdentificacion", Usuario.class);
        query.setParameter("numeroIdentificacion", numeroIdentificacion);
        return (Usuario) query.getSingleResult();
        //Usuario usuario = Util.getSingleResult((TypedQuery<Usuario>) query.getSingleResult());
        //return usuario;
    }

    public Usuario findByNombreUsuario(String nombreUsuario) {
        Query query = em.createNamedQuery("Usuario.findByNumeroIdentificacion", Usuario.class);
        query.setParameter("nombreUsuario", nombreUsuario);
        return (Usuario) query.getSingleResult();
    }

    public List<Usuario> findByRol(int idRol) {
        Query query = em.createNamedQuery("Usuario.findByIdRol", Usuario.class);
        query.setParameter("idRol", idRol);
        return query.getResultList();
    }

}

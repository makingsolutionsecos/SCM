/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "conocimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conocimiento.findAll", query = "SELECT c FROM Conocimiento c"),
    @NamedQuery(name = "Conocimiento.findByIdConocimiento", query = "SELECT c FROM Conocimiento c WHERE c.idConocimiento = :idConocimiento"),
    @NamedQuery(name = "Conocimiento.findByDiagnostico", query = "SELECT c FROM Conocimiento c WHERE c.diagnostico = :diagnostico")})
public class Conocimiento extends EntityObject implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_conocimiento")
    private Integer idConocimiento;
    @Size(max = 2147483647)
    @Column(name = "diagnostico")
    private String diagnostico;
    @JoinColumn(name = "id_respuesta", referencedColumnName = "id_respuesta")
    @ManyToOne
    private Respuesta idRespuesta;

    public Conocimiento() {
    }

    public Conocimiento(Integer idConocimiento) {
        this.idConocimiento = idConocimiento;
    }

    public Integer getIdConocimiento() {
        return idConocimiento;
    }

    public void setIdConocimiento(Integer idConocimiento) {
        this.idConocimiento = idConocimiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Respuesta getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Respuesta idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConocimiento != null ? idConocimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conocimiento)) {
            return false;
        }
        Conocimiento other = (Conocimiento) object;
        if ((this.idConocimiento == null && other.idConocimiento != null) || (this.idConocimiento != null && !this.idConocimiento.equals(other.idConocimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.scm.persistence.Conocimiento[ idConocimiento=" + idConocimiento + " ]";
    }
    
}

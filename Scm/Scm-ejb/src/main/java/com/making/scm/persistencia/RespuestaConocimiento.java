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
@Table(name = "respuesta_conocimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaConocimiento.findAll", query = "SELECT r FROM RespuestaConocimiento r"),
    @NamedQuery(name = "RespuestaConocimiento.findByIdRespuestaConocimiento", query = "SELECT r FROM RespuestaConocimiento r WHERE r.idRespuestaConocimiento = :idRespuestaConocimiento"),
    @NamedQuery(name = "RespuestaConocimiento.findByDiagnostico", query = "SELECT r FROM RespuestaConocimiento r WHERE r.diagnostico = :diagnostico")})
public class RespuestaConocimiento extends EntityObject implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_respuesta_conocimiento")
    private Integer idRespuestaConocimiento;
    @Size(max = 2147483647)
    @Column(name = "diagnostico")
    private String diagnostico;
    @JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
    @ManyToOne
    private Registro idRegistro;

    public RespuestaConocimiento() {
    }

    public RespuestaConocimiento(Integer idRespuestaConocimiento) {
        this.idRespuestaConocimiento = idRespuestaConocimiento;
    }

    public Integer getIdRespuestaConocimiento() {
        return idRespuestaConocimiento;
    }

    public void setIdRespuestaConocimiento(Integer idRespuestaConocimiento) {
        this.idRespuestaConocimiento = idRespuestaConocimiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Registro getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Registro idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuestaConocimiento != null ? idRespuestaConocimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaConocimiento)) {
            return false;
        }
        RespuestaConocimiento other = (RespuestaConocimiento) object;
        if ((this.idRespuestaConocimiento == null && other.idRespuestaConocimiento != null) || (this.idRespuestaConocimiento != null && !this.idRespuestaConocimiento.equals(other.idRespuestaConocimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.scm.persistence.RespuestaConocimiento[ idRespuestaConocimiento=" + idRespuestaConocimiento + " ]";
    }
    
}

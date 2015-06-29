/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.persistence;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "respuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuesta.findAll", query = "SELECT r FROM Respuesta r"),
    @NamedQuery(name = "Respuesta.findByIdRespuesta", query = "SELECT r FROM Respuesta r WHERE r.idRespuesta = :idRespuesta"),
    @NamedQuery(name = "Respuesta.findByIdPregunta", query = "SELECT r FROM Respuesta r WHERE r.idPregunta = :idPregunta"),
    @NamedQuery(name = "Respuesta.findByRespuesta", query = "SELECT r FROM Respuesta r WHERE r.respuesta = :respuesta")})
public class Respuesta implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_respuesta")
    private BigDecimal idRespuesta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pregunta")
    private BigInteger idPregunta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "respuesta")
    private String respuesta;
    @OneToMany(mappedBy = "idRespuesta")
    private List<RespuestaRegistro> respuestaRegistroList;
    @OneToMany(mappedBy = "idRespuesta")
    private List<Conocimiento> conocimientoList;

    public Respuesta() {
    }

    public Respuesta(BigDecimal idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Respuesta(BigDecimal idRespuesta, BigInteger idPregunta, String respuesta) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
    }

    public BigDecimal getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(BigDecimal idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public BigInteger getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(BigInteger idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @XmlTransient
    public List<RespuestaRegistro> getRespuestaRegistroList() {
        return respuestaRegistroList;
    }

    public void setRespuestaRegistroList(List<RespuestaRegistro> respuestaRegistroList) {
        this.respuestaRegistroList = respuestaRegistroList;
    }

    @XmlTransient
    public List<Conocimiento> getConocimientoList() {
        return conocimientoList;
    }

    public void setConocimientoList(List<Conocimiento> conocimientoList) {
        this.conocimientoList = conocimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuesta != null ? idRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuesta)) {
            return false;
        }
        Respuesta other = (Respuesta) object;
        if ((this.idRespuesta == null && other.idRespuesta != null) || (this.idRespuesta != null && !this.idRespuesta.equals(other.idRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.scm.persistence.Respuesta[ idRespuesta=" + idRespuesta + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.persistence;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "respuesta_registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaRegistro.findAll", query = "SELECT r FROM RespuestaRegistro r"),
    @NamedQuery(name = "RespuestaRegistro.findByIdRegistroRespuesta", query = "SELECT r FROM RespuestaRegistro r WHERE r.idRegistroRespuesta = :idRegistroRespuesta"),
    @NamedQuery(name = "RespuestaRegistro.findByTextoOtro", query = "SELECT r FROM RespuestaRegistro r WHERE r.textoOtro = :textoOtro")})
public class RespuestaRegistro implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_registro_respuesta")
    private BigDecimal idRegistroRespuesta;
    @Size(max = 1024)
    @Column(name = "texto_otro")
    private String textoOtro;
    @JoinColumn(name = "id_respuesta", referencedColumnName = "id_respuesta")
    @ManyToOne
    private Respuesta idRespuesta;
    @JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
    @ManyToOne
    private Registro idRegistro;
    @JoinColumn(name = "id_pregunta", referencedColumnName = "id_pregunta")
    @ManyToOne
    private Pregunta idPregunta;

    public RespuestaRegistro() {
    }

    public RespuestaRegistro(BigDecimal idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public BigDecimal getIdRegistroRespuesta() {
        return idRegistroRespuesta;
    }

    public void setIdRegistroRespuesta(BigDecimal idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public String getTextoOtro() {
        return textoOtro;
    }

    public void setTextoOtro(String textoOtro) {
        this.textoOtro = textoOtro;
    }

    public Respuesta getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Respuesta idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Registro getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Registro idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Pregunta getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Pregunta idPregunta) {
        this.idPregunta = idPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroRespuesta != null ? idRegistroRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaRegistro)) {
            return false;
        }
        RespuestaRegistro other = (RespuestaRegistro) object;
        if ((this.idRegistroRespuesta == null && other.idRegistroRespuesta != null) || (this.idRegistroRespuesta != null && !this.idRegistroRespuesta.equals(other.idRegistroRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.scm.persistence.RespuestaRegistro[ idRegistroRespuesta=" + idRegistroRespuesta + " ]";
    }
    
}

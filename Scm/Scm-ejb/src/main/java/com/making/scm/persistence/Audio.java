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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "audio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Audio.findAll", query = "SELECT a FROM Audio a"),
    @NamedQuery(name = "Audio.findByIdAudio", query = "SELECT a FROM Audio a WHERE a.idAudio = :idAudio"),
    @NamedQuery(name = "Audio.findByCadenaAudio", query = "SELECT a FROM Audio a WHERE a.cadenaAudio = :cadenaAudio")})
public class Audio implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_audio")
    private BigDecimal idAudio;
    @Size(max = 2147483647)
    @Column(name = "cadena_audio")
    private String cadenaAudio;
    @JoinColumn(name = "id_registro", referencedColumnName = "id_registro")
    @ManyToOne
    private Registro idRegistro;

    public Audio() {
    }

    public Audio(BigDecimal idAudio) {
        this.idAudio = idAudio;
    }

    public BigDecimal getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(BigDecimal idAudio) {
        this.idAudio = idAudio;
    }

    public String getCadenaAudio() {
        return cadenaAudio;
    }

    public void setCadenaAudio(String cadenaAudio) {
        this.cadenaAudio = cadenaAudio;
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
        hash += (idAudio != null ? idAudio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audio)) {
            return false;
        }
        Audio other = (Audio) object;
        if ((this.idAudio == null && other.idAudio != null) || (this.idAudio != null && !this.idAudio.equals(other.idAudio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.scm.persistence.Audio[ idAudio=" + idAudio + " ]";
    }
    
}

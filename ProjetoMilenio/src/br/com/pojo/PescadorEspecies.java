/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elton
 */
@Entity
@Table
public class PescadorEspecies implements Serializable {


    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String especie;
    @Column
    private String causaPerda;
    @Column
    private String EstimativaPerda;
    @Column
    private String destinoPeixePerdido;
    @Column
    private Integer pescadorId;

    public void all(String especie, String causaPerda, String EstimativaPerda,
            String destinoPeixePerdido, Integer pescadorId) {
        this.especie = especie;
        this.causaPerda = causaPerda;
        this.EstimativaPerda = EstimativaPerda;
        this.destinoPeixePerdido = destinoPeixePerdido;
        this.pescadorId = pescadorId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstimativaPerda() {
        return EstimativaPerda;
    }

    public void setEstimativaPerda(String EstimativaPerda) {
        this.EstimativaPerda = EstimativaPerda;
    }

    public String getCausaPerda() {
        return causaPerda;
    }

    public void setCausaPerda(String causaPerda) {
        this.causaPerda = causaPerda;
    }

    public String getDestinoPeixePerdido() {
        return destinoPeixePerdido;
    }

    public void setDestinoPeixePerdido(String destinoPeixePerdido) {
        this.destinoPeixePerdido = destinoPeixePerdido;
    }

    public Integer getPescadorId() {
        return pescadorId;
    }

    public void setPescadorId(Integer empresaId) {
        this.pescadorId = empresaId;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PescadorEspecies other = (PescadorEspecies) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }


}

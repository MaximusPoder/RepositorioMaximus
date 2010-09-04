/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elton
 */
@Entity
@Table
public class EmpresaPescador implements Serializable {

   
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
    private Integer empresaId;
 @Column
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public void all(String especie, String causaPerda, String EstimativaPerda, String destinoPeixePerdido, Integer empresaId) {
        this.especie = especie;
        this.causaPerda = causaPerda;
        this.EstimativaPerda = EstimativaPerda;
        this.destinoPeixePerdido = destinoPeixePerdido;
        this.empresaId = empresaId;
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

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaPescador)) {
            return false;
        }
        EmpresaPescador other = (EmpresaPescador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pojo.NewEntity[id=" + id + "]";
    }
}

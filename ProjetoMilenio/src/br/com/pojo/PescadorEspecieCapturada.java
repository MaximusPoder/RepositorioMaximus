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
public class PescadorEspecieCapturada implements Serializable {

    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String ssp;
    @Column
    private String inicioSafra;
    @Column
    private String fimSafra;
    @Column
    private Integer pescadorId;

     @Column
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Integer getPescadorId() {
        return pescadorId;
    }

    public void setPescadorId(Integer empresaId) {
        this.pescadorId = empresaId;
    }

    public String getFimSafra() {
        return fimSafra;
    }

    public void setFimSafra(String fimSafra) {
        this.fimSafra = fimSafra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInicioSafra() {
        return inicioSafra;
    }

    public void setInicioSafra(String inicioSafra) {
        this.inicioSafra = inicioSafra;
    }

    public String getSsp() {
        return ssp;
    }

    public void setSsp(String ssp) {
        this.ssp = ssp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PescadorEspecieCapturada other = (PescadorEspecieCapturada) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    
}

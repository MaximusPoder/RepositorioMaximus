/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elton
 */
@Table
@Entity
public class EmpresaEB implements Serializable {

    @Id
    @Column
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String especie;
    @Column
    private String terceiro;
    @Column
    private String apetrecho;
    @Column
    private String epocaAno;
    @Column
    private Integer empresaId;


    public void all(String especie, String terceiro, String apetrecho, String epocaAno, Integer empresaId) {
        this.especie = especie;
        this.terceiro = terceiro;
        this.apetrecho = apetrecho;
        this.epocaAno = epocaAno;
        this.empresaId = empresaId;
    }

 @Column
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getApetrecho() {
        return apetrecho;
    }

    public void setApetrecho(String apetrecho) {
        this.apetrecho = apetrecho;
    }

    public String getEpocaAno() {
        return epocaAno;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    

    public void setEpocaAno(String epocaAno) {
        this.epocaAno = epocaAno;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(String terceiro) {
        this.terceiro = terceiro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaEB other = (EmpresaEB) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  especie;
    }


    
}

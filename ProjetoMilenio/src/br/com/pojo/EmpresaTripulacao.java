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
public class EmpresaTripulacao implements Serializable {

   
    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String relacaoTrabalho;
    @Column
    private String frotaEspecie;
    @Column
    private String funcao;
    @Column
    private String numero;
    @Column
    private String salario;
    @Column
    private String custo;
    @Column
    private String lucro;
    @Column
    private Integer empresaId;

    public Integer getId() {
        return id;
    }

    public String getRelacaoTrabalho() {
        return relacaoTrabalho;
    }

    public void setRelacaoTrabalho(String relacaoTrabalho) {
        this.relacaoTrabalho = relacaoTrabalho;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getFrotaEspecie() {
        return frotaEspecie;
    }

    public void setFrotaEspecie(String frotaEspecie) {
        this.frotaEspecie = frotaEspecie;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getLucro() {
        return lucro;
    }

    public void setLucro(String lucro) {
        this.lucro = lucro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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
        if (!(object instanceof EmpresaTripulacao)) {
            return false;
        }
        EmpresaTripulacao other = (EmpresaTripulacao) object;
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

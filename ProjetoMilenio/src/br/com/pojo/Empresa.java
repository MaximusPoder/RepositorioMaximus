/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Elton
 */
@Table
@Entity
public class Empresa implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String coletor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column
    private String Municipio;
    @Column
    private String nomeEmpresa;
    @Column
    private String endereco;
    @Column
    private String  foneFax;
    @Column
    private String pessoaEntrevistada;
    @Column
    private String tempoEmpresa;
    @Column
    private String status;
    @Column
    private String funcao;

    public void all(String coletor, Date data, String Municipio,
            String nomeEmpresa, String endereco, String foneFax, String pessoaEntrevistada,
            String tempoEmpresa, String status,String funcao) {
        this.coletor = coletor;
        this.data = data;
        this.Municipio = Municipio;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
        this.foneFax = foneFax;
        this.pessoaEntrevistada = pessoaEntrevistada;
        this.tempoEmpresa = tempoEmpresa;
        this.status = status;
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    


    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getColetor() {
        return coletor;
    }

    public void setColetor(String coletor) {
        this.coletor = coletor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFoneFax() {
        return foneFax;
    }

    public void setFoneFax(String foneFax) {
        this.foneFax = foneFax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getPessoaEntrevistada() {
        return pessoaEntrevistada;
    }

    public void setPessoaEntrevistada(String pessoaEntrevistada) {
        this.pessoaEntrevistada = pessoaEntrevistada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(String tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  nomeEmpresa ;
    }



}

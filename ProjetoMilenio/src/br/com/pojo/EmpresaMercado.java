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
public class EmpresaMercado implements Serializable {

   
    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String mercado;
    @Column
    private String especie;
    @Column
    private String produto;
    @Column
    private String destino;
    @Column
    private String volume;
    @Column
    private String valor;
    @Column
    private Integer empresaId;

    public EmpresaMercado() {
    }

    public EmpresaMercado(String mercado, String especie, String produto, String destino, String volume, String valor, Integer empresaId) {
        this.mercado = mercado;
        this.especie = especie;
        this.produto = produto;
        this.destino = destino;
        this.volume = volume;
        this.valor = valor;
        this.empresaId = empresaId;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
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
        if (!(object instanceof EmpresaMercado)) {
            return false;
        }
        EmpresaMercado other = (EmpresaMercado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pojo.EmpresaMercado[id=" + id + "]";
    }

}

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
public class PescadorMaterial implements Serializable {

    @Id
    @Column
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     @Column
    private String material;
    @Column
    private String tipo;
    @Column
    private String quantidade;
    @Column
    private String custo;
    @Column
    private String outros;
    @Column
    private String frequencia;

    @Column
    private Integer pescadorId;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public Integer getId() {
        return id;
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

    public Integer getPescadorId() {
        return pescadorId;
    }

    public void setPescadorId(Integer pescadorId) {
        this.pescadorId = pescadorId;
    }

  

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}

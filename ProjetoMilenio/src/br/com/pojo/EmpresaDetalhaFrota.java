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
@Table
@Entity
public class EmpresaDetalhaFrota implements Serializable{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String frotaEspecie;
    @Column
    private String compMedio;
    @Column
    private String capEstocagem;
    @Column
    private String potenciaMotor;
    @Column
    private String gps;
    @Column
    private String ecos;
    @Column
    private String radar;
    @Column
    private String sonar;
    @Column
    private String guincho;
    @Column
    private String powerBlock;
    @Column
    private String duracao;
    @Column
    private String freq;
    @Column
    private String producao;
    @Column
    private String observacao;
    @Column
    private Integer empresaId;

    public void all(String frotaEspecie, String compMedio, String capEstocagem, String potenciaMotor, String gps, String ecos, String radar, String sonar, String guincho, String powerBlock, String duracao, String freq, String producao, Integer empresaId) {
        this.frotaEspecie = frotaEspecie;
        this.compMedio = compMedio;
        this.capEstocagem = capEstocagem;
        this.potenciaMotor = potenciaMotor;
        this.gps = gps;
        this.ecos = ecos;
        this.radar = radar;
        this.sonar = sonar;
        this.guincho = guincho;
        this.powerBlock = powerBlock;
        this.duracao = duracao;
        this.freq = freq;
        this.producao = producao;
        this.empresaId = empresaId;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }



    public String getCapEstocagem() {
        return capEstocagem;
    }

    public void setCapEstocagem(String capEstocagem) {
        this.capEstocagem = capEstocagem;
    }

    public String getCompMedio() {
        return compMedio;
    }

    public void setCompMedio(String compMedio) {
        this.compMedio = compMedio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getEcos() {
        return ecos;
    }

    public void setEcos(String ecos) {
        this.ecos = ecos;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public String getFrotaEspecie() {
        return frotaEspecie;
    }

    public void setFrotaEspecie(String frotaEspecie) {
        this.frotaEspecie = frotaEspecie;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getGuincho() {
        return guincho;
    }

    public void setGuincho(String guincho) {
        this.guincho = guincho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getPowerBlock() {
        return powerBlock;
    }

    public void setPowerBlock(String powerBlock) {
        this.powerBlock = powerBlock;
    }

    public String getProducao() {
        return producao;
    }

    public void setProducao(String producao) {
        this.producao = producao;
    }

    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }

    public String getSonar() {
        return sonar;
    }

    public void setSonar(String sonar) {
        this.sonar = sonar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaDetalhaFrota other = (EmpresaDetalhaFrota) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    


}

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
public class EmpresaFuncionamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String administracao;
    @Column
    private String benefiamento;
    @Column
    private String apoio;
    @Column
    private String pescadores;
    @Column
    private String verao;
    @Column
    private String inverno;
    @Column
    private String administracaoTempo;
    @Column
    private String benefiamentoTempo;
    @Column
    private String apoioTempo;
    @Column
    private String administracaoSalario;
    @Column
    private String benefiamentoSalario;
    @Column
    private String apoioSalario;
    @Column
    private String questao64;
    @Column
    private String questao65;
    @Column
    private String questao66;
    @Column
    private Integer empresaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }


    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }

    public String getAdministracaoSalario() {
        return administracaoSalario;
    }

    public void setAdministracaoSalario(String administracaoSalario) {
        this.administracaoSalario = administracaoSalario;
    }

    public String getAdministracaoTempo() {
        return administracaoTempo;
    }

    public void setAdministracaoTempo(String administracaoTempo) {
        this.administracaoTempo = administracaoTempo;
    }

    public String getApoio() {
        return apoio;
    }

    public void setApoio(String apoio) {
        this.apoio = apoio;
    }

    public String getApoioSalario() {
        return apoioSalario;
    }

    public void setApoioSalario(String apoioSalario) {
        this.apoioSalario = apoioSalario;
    }

    public String getApoioTempo() {
        return apoioTempo;
    }

    public void setApoioTempo(String apoioTempo) {
        this.apoioTempo = apoioTempo;
    }

    public String getBenefiamento() {
        return benefiamento;
    }

    public void setBenefiamento(String benefiamento) {
        this.benefiamento = benefiamento;
    }

    public String getBenefiamentoSalario() {
        return benefiamentoSalario;
    }

    public void setBenefiamentoSalario(String benefiamentoSalario) {
        this.benefiamentoSalario = benefiamentoSalario;
    }

    public String getBenefiamentoTempo() {
        return benefiamentoTempo;
    }

    public void setBenefiamentoTempo(String benefiamentoTempo) {
        this.benefiamentoTempo = benefiamentoTempo;
    }

    public String getInverno() {
        return inverno;
    }

    public void setInverno(String inverno) {
        this.inverno = inverno;
    }

    public String getPescadores() {
        return pescadores;
    }

    public void setPescadores(String pescadores) {
        this.pescadores = pescadores;
    }

    public String getQuestao64() {
        return questao64;
    }

    public void setQuestao64(String questao64) {
        this.questao64 = questao64;
    }

    public String getQuestao65() {
        return questao65;
    }

    public void setQuestao65(String questao65) {
        this.questao65 = questao65;
    }

    public String getQuestao66() {
        return questao66;
    }

    public void setQuestao66(String questao66) {
        this.questao66 = questao66;
    }

    public String getVerao() {
        return verao;
    }

    public void setVerao(String verao) {
        this.verao = verao;
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
        if (!(object instanceof EmpresaFuncionamento)) {
            return false;
        }
        EmpresaFuncionamento other = (EmpresaFuncionamento) object;
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

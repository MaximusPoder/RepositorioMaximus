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
public class EmpresaQuestionario3 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao24;
    @Column
    private String questao25;
    @Column
    private String questao26;
    @Column
    private String questao27;
    @Column
    private String questao28;
    @Column
    private String questao29;
    @Column
    private String questao30;
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
    public void all(String questao24, String questao25, String questao26,
            String questao27, String questao28, String questao29, String questao30,
             Integer empresaId) {
        this.questao24 = questao24;
        this.questao25 = questao25;
        this.questao26 = questao26;
        this.questao27 = questao27;
        this.questao28 = questao28;
        this.questao29 = questao29;
        this.questao30 = questao30;
        this.empresaId = empresaId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestao24() {
        return questao24;
    }

    public void setQuestao24(String questao24) {
        this.questao24 = questao24;
    }

    public String getQuestao25() {
        return questao25;
    }

    public void setQuestao25(String questao25) {
        this.questao25 = questao25;
    }

    public String getQuestao26() {
        return questao26;
    }

    public void setQuestao26(String questao26) {
        this.questao26 = questao26;
    }

    public String getQuestao27() {
        return questao27;
    }

    public void setQuestao27(String questao27) {
        this.questao27 = questao27;
    }

    public String getQuestao28() {
        return questao28;
    }

    public void setQuestao28(String questao28) {
        this.questao28 = questao28;
    }

    public String getQuestao29() {
        return questao29;
    }

    public void setQuestao29(String questao29) {
        this.questao29 = questao29;
    }

    public String getQuestao30() {
        return questao30;
    }

    public void setQuestao30(String questao30) {
        this.questao30 = questao30;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario3 other = (EmpresaQuestionario3) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    
}

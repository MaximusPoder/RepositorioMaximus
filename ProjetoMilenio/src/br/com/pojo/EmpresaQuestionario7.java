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
public class EmpresaQuestionario7 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao55;
    @Column
    private String questao56;
    @Column
    private String questao57;
    @Column
    private String questao58;
    @Column
    private String questao59;
    @Column
    private String questao60;
    @Column
    private String questao61;
    @Column
    private String questao62;
    @Column
    private String questao63;
    @Column
    private String questao64;
    @Column
    private String questao65;
    @Column
    private String questao66;
    @Column
    private Integer empresaId;

    public void all(String questao55, String questao56, String questao57, String questao58, String questao59, String questao60, String questao61, String questao62, String questao63, String questao64, String questao65, String questao66, Integer empresaId) {
        this.questao55 = questao55;
        this.questao56 = questao56;
        this.questao57 = questao57;
        this.questao58 = questao58;
        this.questao59 = questao59;
        this.questao60 = questao60;
        this.questao61 = questao61;
        this.questao62 = questao62;
        this.questao63 = questao63;
        this.questao64 = questao64;
        this.questao65 = questao65;
        this.questao66 = questao66;
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

    public String getQuestao55() {
        return questao55;
    }

    public void setQuestao55(String questao55) {
        this.questao55 = questao55;
    }

    public String getQuestao56() {
        return questao56;
    }

    public void setQuestao56(String questao56) {
        this.questao56 = questao56;
    }

    public String getQuestao57() {
        return questao57;
    }

    public void setQuestao57(String questao57) {
        this.questao57 = questao57;
    }

    public String getQuestao58() {
        return questao58;
    }

    public void setQuestao58(String questao58) {
        this.questao58 = questao58;
    }

    public String getQuestao59() {
        return questao59;
    }

    public void setQuestao59(String questao59) {
        this.questao59 = questao59;
    }

    public String getQuestao60() {
        return questao60;
    }

    public void setQuestao60(String questao60) {
        this.questao60 = questao60;
    }

    public String getQuestao61() {
        return questao61;
    }

    public void setQuestao61(String questao61) {
        this.questao61 = questao61;
    }

    public String getQuestao62() {
        return questao62;
    }

    public void setQuestao62(String questao62) {
        this.questao62 = questao62;
    }

    public String getQuestao63() {
        return questao63;
    }

    public void setQuestao63(String questao63) {
        this.questao63 = questao63;
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

    

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario7 other = (EmpresaQuestionario7) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
}

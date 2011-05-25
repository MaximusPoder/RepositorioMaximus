/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Elton
 */
public class EmpresaQuestionario6 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao48;
    @Column
    private String questao49;
    @Column
    private String questao50;
    @Column
    private String questao51;
    @Column
    private String questao52;
    @Column
    private String questao53;
    @Column
    private Integer empresaId;

    public void all(String questao48, String questao49, String questao50, String questao51, String questao52, String questao53, Integer empresaId) {
        this.questao48 = questao48;
        this.questao49 = questao49;
        this.questao50 = questao50;
        this.questao51 = questao51;
        this.questao52 = questao52;
        this.questao53 = questao53;
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

    public String getQuestao48() {
        return questao48;
    }

    public void setQuestao48(String questao48) {
        this.questao48 = questao48;
    }

    public String getQuestao49() {
        return questao49;
    }

    public void setQuestao49(String questao49) {
        this.questao49 = questao49;
    }

    public String getQuestao50() {
        return questao50;
    }

    public void setQuestao50(String questao50) {
        this.questao50 = questao50;
    }

    public String getQuestao51() {
        return questao51;
    }

    public void setQuestao51(String questao51) {
        this.questao51 = questao51;
    }

    public String getQuestao52() {
        return questao52;
    }

    public void setQuestao52(String questao52) {
        this.questao52 = questao52;
    }

    public String getQuestao53() {
        return questao53;
    }

    public void setQuestao53(String questao53) {
        this.questao53 = questao53;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario6 other = (EmpresaQuestionario6) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.pojo;

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
public class EmpresaQuestionario2 {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao15;
    @Column
    private String questao16;
    @Column
    private String questao17;
    @Column
    private String questao18;
    @Column
    private String questao19;
    @Column
    private String questao20;
    @Column
    private String questao21;
    @Column
    private String questao22;
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
    public void all(String questao15, String questao16, String questao17, String questao18, String questao19, String questao20, String questao21, String questao22, Integer empresaId) {
        this.questao15 = questao15;
        this.questao16 = questao16;
        this.questao17 = questao17;
        this.questao18 = questao18;
        this.questao19 = questao19;
        this.questao20 = questao20;
        this.questao21 = questao21;
        this.questao22 = questao22;
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

    public String getQuestao15() {
        return questao15;
    }

    public void setQuestao15(String questao15) {
        this.questao15 = questao15;
    }

    public String getQuestao16() {
        return questao16;
    }

    public void setQuestao16(String questao16) {
        this.questao16 = questao16;
    }

    public String getQuestao17() {
        return questao17;
    }

    public void setQuestao17(String questao17) {
        this.questao17 = questao17;
    }

    public String getQuestao18() {
        return questao18;
    }

    public void setQuestao18(String questao18) {
        this.questao18 = questao18;
    }

    public String getQuestao19() {
        return questao19;
    }

    public void setQuestao19(String questao19) {
        this.questao19 = questao19;
    }

    public String getQuestao20() {
        return questao20;
    }

    public void setQuestao20(String questao20) {
        this.questao20 = questao20;
    }

    public String getQuestao21() {
        return questao21;
    }

    public void setQuestao21(String questao21) {
        this.questao21 = questao21;
    }

    public String getQuestao22() {
        return questao22;
    }

    public void setQuestao22(String questao22) {
        this.questao22 = questao22;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario2 other = (EmpresaQuestionario2) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    


}

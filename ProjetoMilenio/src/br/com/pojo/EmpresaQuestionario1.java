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
public class EmpresaQuestionario1 implements Serializable {

    @Id
    @Column
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao8;
    @Column
    private String questao9;
    @Column
    private String questao10;
    @Column
    private String questao11;
    @Column
    private String questao12;
    @Column
    private String questao13;
    @Column
    private Integer empresaId;

    public void all(String questao8, String questao9, String questao10, String questao11, String questao12, String questao13, Integer empresaId) {
        this.questao8 = questao8;
        this.questao9 = questao9;
        this.questao10 = questao10;
        this.questao11 = questao11;
        this.questao12 = questao12;
        this.questao13 = questao13;
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

    public String getQuestao10() {
        return questao10;
    }

    public void setQuestao10(String questao10) {
        this.questao10 = questao10;
    }

    public String getQuestao11() {
        return questao11;
    }

    public void setQuestao11(String questao11) {
        this.questao11 = questao11;
    }

    public String getQuestao12() {
        return questao12;
    }

    public void setQuestao12(String questao12) {
        this.questao12 = questao12;
    }

    public String getQuestao13() {
        return questao13;
    }

    public void setQuestao13(String questao13) {
        this.questao13 = questao13;
    }

    public String getQuestao8() {
        return questao8;
    }

    public void setQuestao8(String questao8) {
        this.questao8 = questao8;
    }

    public String getQuestao9() {
        return questao9;
    }

    public void setQuestao9(String questao9) {
        this.questao9 = questao9;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario1 other = (EmpresaQuestionario1) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
}

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
public class EmpresaQuestionario5 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String questao39;
    @Column
    private String questao40;
    @Column
    private String questao41;
    @Column
    private String questao42;
    @Column
    private String questao43;
    @Column
    private String questao44;
    @Column
    private String questao45;
    @Column
    private String questao46;
    @Column
    private Integer empresaId;

    public void all(String questao39, String questao40, String questao41,
            String questao42, String questao43, String questao44, String questao45,
            String questao46, Integer empresaId) {
        this.questao39 = questao39;
        this.questao40 = questao40;
        this.questao41 = questao41;
        this.questao42 = questao42;
        this.questao43 = questao43;
        this.questao44 = questao44;
        this.questao45 = questao45;
        this.questao46 = questao46;
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

    public String getQuestao39() {
        return questao39;
    }

    public void setQuestao39(String questao39) {
        this.questao39 = questao39;
    }

    public String getQuestao40() {
        return questao40;
    }

    public void setQuestao40(String questao40) {
        this.questao40 = questao40;
    }

    public String getQuestao41() {
        return questao41;
    }

    public void setQuestao41(String questao41) {
        this.questao41 = questao41;
    }

    public String getQuestao42() {
        return questao42;
    }

    public void setQuestao42(String questao42) {
        this.questao42 = questao42;
    }

    public String getQuestao43() {
        return questao43;
    }

    public void setQuestao43(String questao43) {
        this.questao43 = questao43;
    }

    public String getQuestao44() {
        return questao44;
    }

    public void setQuestao44(String questao44) {
        this.questao44 = questao44;
    }

    public String getQuestao45() {
        return questao45;
    }

    public void setQuestao45(String questao45) {
        this.questao45 = questao45;
    }

    public String getQuestao46() {
        return questao46;
    }

    public void setQuestao46(String questao46) {
        this.questao46 = questao46;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario5 other = (EmpresaQuestionario5) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }


}
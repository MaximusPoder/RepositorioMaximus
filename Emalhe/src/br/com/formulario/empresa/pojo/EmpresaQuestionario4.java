/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.formulario.empresa.pojo;

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
public class EmpresaQuestionario4 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao31;
    @Column
    private String questao32;
    @Column
    private String questao33;
    @Column
    private String questao34;
    @Column
    private String questao35;
    @Column
    private String questao36;
    @Column
    private String questao37;
    @Column
    private String questao38;
    @Column
    private String relacaoTrabalho;//Relaçoes de trabalho
    @Column
    private Integer empresaId;

    public void all(String questao31, String questao32,
            String questao33, String questao34, String questao35, String questao36,
            String questao37, String questao38, String relacaoTrabalho, Integer empresaId) {
        this.questao31 = questao31;
        this.questao32 = questao32;
       
        this.questao33 = questao33;
        this.questao34 = questao34;
        this.questao35 = questao35;
        this.questao36 = questao36;
        this.questao37 = questao37;
        this.questao38 = questao38;
        this.relacaoTrabalho = relacaoTrabalho;
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

    public String getQuestao31() {
        return questao31;
    }

    public void setQuestao31(String questao31) {
        this.questao31 = questao31;
    }

    public String getQuestao32() {
        return questao32;
    }

    public void setQuestao32(String questao32) {
        this.questao32 = questao32;
    }

    public String getQuestao33() {
        return questao33;
    }

    public void setQuestao33(String questao33) {
        this.questao33 = questao33;
    }

    public String getQuestao34() {
        return questao34;
    }

    public void setQuestao34(String questao34) {
        this.questao34 = questao34;
    }

    public String getQuestao35() {
        return questao35;
    }

    public void setQuestao35(String questao35) {
        this.questao35 = questao35;
    }

    public String getQuestao36() {
        return questao36;
    }

    public void setQuestao36(String questao36) {
        this.questao36 = questao36;
    }

    public String getQuestao37() {
        return questao37;
    }

    public void setQuestao37(String questao37) {
        this.questao37 = questao37;
    }

    public String getQuestao38() {
        return questao38;
    }

    public void setQuestao38(String questao38) {
        this.questao38 = questao38;
    }

    public String getRelacaoTrabalho() {
        return relacaoTrabalho;
    }

    public void setRelacaoTrabalho(String relacaoTrabalho) {
        this.relacaoTrabalho = relacaoTrabalho;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaQuestionario4 other = (EmpresaQuestionario4) obj;
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
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
    private String questao9_1;
    @Column
    private String questao9_2;
    @Column
    private String questao9_3;
    @Column
    private String questao9_4;
    @Column
    private String questao9_5;
    @Column
    private String questao9_6;
    @Column
    private String questao9_7;
    @Column
    private String questao9_8;
    @Column
    private String questao9_9;
    @Column
    private String questao9_10;
    @Column
    private String questao9_11;
    @Column
    private String questao9_12;
    @Column
    private String questao9_13;
    @Column
    private String questao9_14;
    @Column
    private String questao9_15;
    @Column
    private String questao10_1;
    @Column
     private String questao10_2;
    @Column
     private String questao10_3;
    @Column
     private String questao10_4;
    @Column
    private String questao11;
    @Column
    private String questao12;
    @Column
    private String questao13;
    @Column
    private Integer empresaId;


    public String getQuestao9_14() {
        return questao9_14;
    }

    public void all(String questao8, String questao9_1, String questao9_2, String questao9_3, String questao9_4, String questao9_5, String questao9_6, String questao9_7, String questao9_8, String questao9_9, String questao9_10, String questao9_11, String questao9_12, String questao9_13, String questao9_14, String questao9_15, String questao10_1, String questao10_2, String questao10_3, String questao10_4, String questao11, String questao12, String questao13, Integer empresaId) {
        this.questao8 = questao8;
        this.questao9_1 = questao9_1;
        this.questao9_2 = questao9_2;
        this.questao9_3 = questao9_3;
        this.questao9_4 = questao9_4;
        this.questao9_5 = questao9_5;
        this.questao9_6 = questao9_6;
        this.questao9_7 = questao9_7;
        this.questao9_8 = questao9_8;
        this.questao9_9 = questao9_9;
        this.questao9_10 = questao9_10;
        this.questao9_11 = questao9_11;
        this.questao9_12 = questao9_12;
        this.questao9_13 = questao9_13;
        this.questao9_14 = questao9_14;
        this.questao9_15 = questao9_15;
        this.questao10_1 = questao10_1;
        this.questao10_2 = questao10_2;
        this.questao10_3 = questao10_3;
        this.questao10_4 = questao10_4;
        this.questao11 = questao11;
        this.questao12 = questao12;
        this.questao13 = questao13;
        this.empresaId = empresaId;
    }

    public void setQuestao9_14(String questao9_14) {
        this.questao9_14 = questao9_14;
    }

    public String getQuestao9_15() {
        return questao9_15;
    }

    public void setQuestao9_15(String questao9_15) {
        this.questao9_15 = questao9_15;
    }





    public String getQuestao10_1() {
        return questao10_1;
    }

    public void setQuestao10_1(String questao10_1) {
        this.questao10_1 = questao10_1;
    }

    public String getQuestao10_2() {
        return questao10_2;
    }

    public void setQuestao10_2(String questao10_2) {
        this.questao10_2 = questao10_2;
    }

    public String getQuestao10_3() {
        return questao10_3;
    }

    public void setQuestao10_3(String questao10_3) {
        this.questao10_3 = questao10_3;
    }

    public String getQuestao10_4() {
        return questao10_4;
    }

    public void setQuestao10_4(String questao10_4) {
        this.questao10_4 = questao10_4;
    }

    
    public String getQuestao9_1() {
        return questao9_1;
    }

    public void setQuestao9_1(String questao9_1) {
        this.questao9_1 = questao9_1;
    }

    public String getQuestao9_10() {
        return questao9_10;
    }

    public void setQuestao9_10(String questao9_10) {
        this.questao9_10 = questao9_10;
    }

    public String getQuestao9_11() {
        return questao9_11;
    }

    public void setQuestao9_11(String questao9_11) {
        this.questao9_11 = questao9_11;
    }

    public String getQuestao9_12() {
        return questao9_12;
    }

    public void setQuestao9_12(String questao9_12) {
        this.questao9_12 = questao9_12;
    }

    public String getQuestao9_13() {
        return questao9_13;
    }

    public void setQuestao9_13(String questao9_13) {
        this.questao9_13 = questao9_13;
    }

    public String getQuestao9_2() {
        return questao9_2;
    }

    public void setQuestao9_2(String questao9_2) {
        this.questao9_2 = questao9_2;
    }

    public String getQuestao9_3() {
        return questao9_3;
    }

    public void setQuestao9_3(String questao9_3) {
        this.questao9_3 = questao9_3;
    }

    public String getQuestao9_4() {
        return questao9_4;
    }

    public void setQuestao9_4(String questao9_4) {
        this.questao9_4 = questao9_4;
    }

    public String getQuestao9_5() {
        return questao9_5;
    }

    public void setQuestao9_5(String questao9_5) {
        this.questao9_5 = questao9_5;
    }

    public String getQuestao9_6() {
        return questao9_6;
    }

    public void setQuestao9_6(String questao9_6) {
        this.questao9_6 = questao9_6;
    }

    public String getQuestao9_7() {
        return questao9_7;
    }

    public void setQuestao9_7(String questao9_7) {
        this.questao9_7 = questao9_7;
    }

    public String getQuestao9_8() {
        return questao9_8;
    }

    public void setQuestao9_8(String questao9_8) {
        this.questao9_8 = questao9_8;
    }

    public String getQuestao9_9() {
        return questao9_9;
    }

    public void setQuestao9_9(String questao9_9) {
        this.questao9_9 = questao9_9;
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

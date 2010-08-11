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
public class PescadorComposicao implements Serializable {

    @Id
    @Column
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String questao1;
    @Column
    private String questao2;
    @Column
    private String questao3;
    @Column
    private String questao4;
    @Column
    private String questao5;
    @Column
    private String questao6;
    @Column
    private String questao7;
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
    private String questao14;
    @Column
    private String questao15;
    @Column
    private String questao16;
    @Column
    private String questao17;
    @Column
    private String questao18;
    @Column
    private Integer pescadorId;

    public void all(String questao1, String questao2, String questao3, String questao4, String questao5, String questao6, String questao7, String questao8, String questao9, String questao10, String questao11, String questao12, String questao13, String questao14, String questao15, String questao16, String questao17, String questao18, Integer pescadorId) {
        this.questao1 = questao1;
        this.questao2 = questao2;
        this.questao3 = questao3;
        this.questao4 = questao4;
        this.questao5 = questao5;
        this.questao6 = questao6;
        this.questao7 = questao7;
        this.questao8 = questao8;
        this.questao9 = questao9;
        this.questao10 = questao10;
        this.questao11 = questao11;
        this.questao12 = questao12;
        this.questao13 = questao13;
        this.questao14 = questao14;
        this.questao15 = questao15;
        this.questao16 = questao16;
        this.questao17 = questao17;
        this.questao18 = questao18;
        this.pescadorId = pescadorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPescadorId() {
        return pescadorId;
    }

    public void setPescadorId(Integer pescadorId) {
        this.pescadorId = pescadorId;
    }

    public String getQuestao1() {
        return questao1;
    }

    public void setQuestao1(String questao1) {
        this.questao1 = questao1;
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

    public String getQuestao14() {
        return questao14;
    }

    public void setQuestao14(String questao14) {
        this.questao14 = questao14;
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

    public String getQuestao2() {
        return questao2;
    }

    public void setQuestao2(String questao2) {
        this.questao2 = questao2;
    }

    public String getQuestao3() {
        return questao3;
    }

    public void setQuestao3(String questao3) {
        this.questao3 = questao3;
    }

    public String getQuestao4() {
        return questao4;
    }

    public void setQuestao4(String questao4) {
        this.questao4 = questao4;
    }

    public String getQuestao5() {
        return questao5;
    }

    public void setQuestao5(String questao5) {
        this.questao5 = questao5;
    }

    public String getQuestao6() {
        return questao6;
    }

    public void setQuestao6(String questao6) {
        this.questao6 = questao6;
    }

    public String getQuestao7() {
        return questao7;
    }

    public void setQuestao7(String questao7) {
        this.questao7 = questao7;
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
        final PescadorComposicao other = (PescadorComposicao) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    




}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pojo;

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
public class Pescador {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String municipio;
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
    private String composicao_familiar;
    @Column
    private String escolaridade;
    @Column
    private String pq_parou;
    @Column
    private String local_moradia;
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
    private String questao19;
    @Column
    private String questao20;
    @Column
    private String questao21;
    @Column
    private String questao22;
    @Column
    private String questao23;
    @Column
    private String questao24;
    @Column
    private String questao25;
    @Column
    private String questao26;

      @Column
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public void all(String questao1, String questao2, String questao3, String questao4, String questao5, String questao6, String questao7, String questao8, String questao9, String questao10, String questao11, String questao12, String questao13, String questao14, String questao15, String questao16, String questao17, String questao18, String questao19, String questao20, String questao21, String questao22, String questao23, String questao24, String questao25, String questao26) {
        this.municipio = questao1;
        this.questao2 = questao2;
        this.questao3 = questao3;
        this.questao4 = questao4;
        this.questao5 = questao5;
        this.questao6 = questao6;
        this.questao7 = questao7;
        this.questao8 = questao8;
        this.questao9 = questao9;
        this.composicao_familiar = questao10;
        this.escolaridade = questao11;
        this.pq_parou = questao12;
        this.local_moradia = questao13;
        this.questao14 = questao14;
        this.questao15 = questao15;
        this.questao16 = questao16;
        this.questao17 = questao17;
        this.questao18 = questao18;
        this.questao19 = questao19;
        this.questao20 = questao20;
        this.questao21 = questao21;
        this.questao22 = questao22;
        this.questao23 = questao23;
        this.questao24 = questao24;
        this.questao25 = questao25;
        this.questao26 = questao26;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getQuestao10() {
        return composicao_familiar;
    }



    public void setQuestao10(String questao10) {
        this.composicao_familiar = questao10;
    }

    public String getQuestao11() {
        return escolaridade;
    }

    public void setQuestao11(String questao11) {
        this.escolaridade = questao11;
    }

    public String getQuestao12() {
        return pq_parou;
    }

    public void setQuestao12(String questao12) {
        this.pq_parou = questao12;
    }

    public String getQuestao13() {
        return local_moradia;
    }

    public void setQuestao13(String questao13) {
        this.local_moradia = questao13;
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

    public String getQuestao19() {
        return questao19;
    }

    public void setQuestao19(String questao19) {
        this.questao19 = questao19;
    }

    public String getQuestao2() {
        return questao2;
    }

    public void setQuestao2(String questao2) {
        this.questao2 = questao2;
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

    public String getQuestao23() {
        return questao23;
    }

    public void setQuestao23(String questao23) {
        this.questao23 = questao23;
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
        final Pescador other = (Pescador) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  questao2;
    }

    



}

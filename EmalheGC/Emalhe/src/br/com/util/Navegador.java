/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhonathas
 */
public class Navegador<T> {

    private List<T> list;
    private Integer index;

    public Navegador(List<T> t) {
        list = t;
        index = 0;
    }

    public Object proximo() {
        if (index >= 0 && !(index == tamanho())) {
            index++;
            return list.get(index);
        }
        return list.get(index);
    }

    public Object ultimo() {
        index = tamanho();
        return list.get(index);
    }

    public Object anterior() {
        if (index == 0) {
            return list.get(index);
        } else {
            index--;
            return list.get(index);
        }

    }

    public Object primeiro() {
        index = 0;
        return list.get(0);

    }

    private Integer tamanho() {
        return list.size() - 1;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;


import br.com.Persistencia.Conexao;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Elton
 */
public interface IOperationBean<T> {
    
    
    public boolean cadastrar(T bean);
    public boolean excluir(T bean);
    public boolean atualizar(T bean);
    public List<T> getListWithQuery(String query);
    public T getObjectWithQuery(String query);


}

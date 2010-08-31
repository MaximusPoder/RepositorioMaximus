package br.com.Persistencia;

//import com.sun.rowset.JdbcRowSetImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    final private String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    final private String url = "jdbc:odbc:";
    //"jdbc:odbc:teste";
    final private String userName = "";
    final private String password = "";
    private Connection connection;
    private Statement statement;
    public ResultSet resultSet;

    /**
     * Realiza a conexão com Acess
     * @param nome Nome do Banco de dados Acess
     * @return Verdadeiro se Estabelecer uma conexão com bd
     */
    public boolean conecta(String nome) {
        boolean result = true;

        try {
            Class.forName(driver);

            connection = DriverManager.getConnection(url + nome, userName, password);
            
            return result;

        } catch (ClassNotFoundException exception) {
            System.out.println("Erro de driver" + exception);
            return false;
        } catch (SQLException exception) {
            System.out.println("Erro de sql.: " + exception);
            return false;
        }

    }

    /**
     * Desconecta do Banco de dados Acess
     * @return Verdadeiro caso encerre a conexão.
     */
    public boolean desconecta() {
        try {

            connection.close();            
            return true;
        } catch (Exception exception) {

            System.out.println("Erro em fechar.: " + exception);
            return false;
        }

    }

    public void execute(String sql) {
        try {

           statement = connection.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        } catch (Exception exception) {
            System.out.println("Erro execute.: " + exception);
        }

    }

     public boolean  salvar(String sql) {
        try {

            statement = connection.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);
           return  1 == statement.executeUpdate(sql);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar " + exception);
            System.out.println("Erro execute.: " + exception);
        }
        return false;

    }


    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Realize the save,update e delete operation
     * @param sql The String sql
     * @Exemple Insert Into pessoa (nome,idade) values (pessoa.getNome,pessoa.getIdade)
     */
    public boolean update(String sql) {
        try {

            statement = connection.createStatement();
            return 1 == statement.executeUpdate(sql);
        } catch (Exception exception) {
            System.out.println("Erro execute.: " + exception);
        }
        return false;
    }

    

}

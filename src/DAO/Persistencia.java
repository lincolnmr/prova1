package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ObjetoBase;

public abstract class Persistencia {

    private Connection conexao;

    public Persistencia(){  
        conexao = Fabrica.getConexaoNOVA();
        criarSQL();
    }

    public abstract void InformarDadosBD();

    public abstract void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException;

    private String tabela;
    private String[] campos;
    private String campoChave;

    private String SQL_INSERT;
    private String SQL_UPDATE;
    private String SQL_DELETE;
    private String SQL_RECUPERAR;
    private String SQL_RECUPERAR_TODOS;

    public String criarSQL_INSERT() {
        String sql = "INSERT INTO " + tabela + "(";
        for (int i = 0; i < campos.length; i++) {
            sql = sql + campos[i];
            if (i < campos.length - 1) {
                sql = sql + ", ";
            }
        }
        sql = sql + ") VALUES(";
        for (int i = 0; i < campos.length; i++) {

            sql = sql + " ? ";
            if (i < campos.length - 1) {
                sql = sql + ", ";
            }
        }
        sql = sql + ")";

        return sql;
    }

    public String criarSQL_UPDATE() {
        String sql = "UPDATE" + tabela + "SET ";
        for (int i = 0; i < campos.length; i++) {
            sql = sql + campos[i] + " = ?";
        }
        sql = sql + "WHERE " + campoChave + " = ?";

        return sql;
    }

    public String criarSQL_DELETE() {
        String sql = "DELETE FROM " + tabela + " WHERE " + campoChave + " = ?";
        return sql;
    }

    public String criarSQL_RECUPERAR() {
        String sql = "SELECT * FROM " + tabela + " WHERE " + campoChave + " = ?";
        return sql;
    }
    
    public String criarSQL_RECUPERAR_TODOS() {
        String sql = "SELECT * FROM " + tabela;
        return sql;
    }

    private void criarSQL() {
        InformarDadosBD();
        SQL_INSERT = criarSQL_INSERT();
        SQL_UPDATE = criarSQL_UPDATE();
        SQL_DELETE = criarSQL_DELETE();
        SQL_RECUPERAR = criarSQL_RECUPERAR();
        SQL_RECUPERAR_TODOS = criarSQL_RECUPERAR_TODOS();
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String[] getCampos() {
        return campos;
    }

    public void setCampos(String[] campos) {
        this.campos = campos;
    }

    public String getCampoChave() {
        return campoChave;
    }

    public void setCampoChave(String campoChave) {
        this.campoChave = campoChave;
    }

    public void insert(ObjetoBase obj) {
        try {
            PreparedStatement ST = conexao.prepareStatement(SQL_INSERT);
            mapearParametrosSQL(ST, obj);
            ST.executeUpdate();
            conexao.commit();
            System.out.println("Inserido");
        } catch (SQLException err) {
            System.err.println("Erro ao INSERIR: " + err.getMessage());
        }
    }

    public void atualizar(ObjetoBase obj) {
        try {
            PreparedStatement ST = conexao.prepareStatement(SQL_UPDATE);
            mapearParametrosSQL(ST, obj);
            ST.executeUpdate();
            conexao.commit();
            System.out.println("Atualizado");
        } catch (SQLException err) {
            System.err.println("Erro ao ATUALIZAR: " + err.getMessage());
        }
    }

    public boolean excluir(ObjetoBase obj) {
        try {
            PreparedStatement ST = conexao.prepareStatement(SQL_DELETE);
            ST.setInt(1, obj.getId());
            ST.execute();
            System.out.println("Excluido");
            return true;
        } catch (SQLException err) {
            System.err.println("Erro ao excluir: " + err.getMessage());
        }
        return false;
    }

    public ObjetoBase recuperar(int chave) {
        ObjetoBase obj = null;
        return obj;
    }
    
    public ArrayList<ObjetoBase> recuperarTodos(){
        ObjetoBase obj = null;
        ArrayList<ObjetoBase> lista = new ArrayList<>();

        try {
            PreparedStatement ST = conexao.prepareStatement(SQL_RECUPERAR_TODOS);
            mapearParametrosSQL(ST, obj);
            ResultSet objResultSet = ST.executeQuery();
            while(objResultSet.next()){
                
                lista.add(obj);
            }
            return lista;

        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar todos - DAO \n" + ex.getMessage());
        }
        return null;
    }
}

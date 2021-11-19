package controller;

import DAO.Persistencia;
import java.util.ArrayList;
import model.ObjetoBase;
import org.json.simple.JSONArray;

public abstract class ControllerBase {

    protected ObjetoBase objModel;
    protected Persistencia objDAO;

    public ControllerBase() {
        instanciarObjetos();
    }

    public void inserir(JSONArray dados) {
        objModel.jsonTo(dados);
        objDAO.insert(objModel);
    }

    public void atualizar(JSONArray dados) {
        objModel.jsonTo(dados);
        objDAO.atualizar(objModel);
    }

    public boolean excluir(Integer chave) {
        try {
            objModel.setId(chave);
            objDAO.excluir(objModel);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public JSONArray recuperar(Integer chave) {
        ObjetoBase obj = objDAO.recuperar(chave);
        if (obj != null) {
            return obj.toJson();
        } else {
            return new JSONArray();
        }
    }

    public String[][] recuperarTodos(int quantColunas) {
        ArrayList<ObjetoBase> lista = objDAO.recuperarTodos();
        
        String[][] matrizReturn = null;
        matrizReturn = new String[lista.size()][quantColunas];

        for (int i = 0; i < lista.size(); i++) {
            matrizReturn[i] = lista.get(i).preencheTabela();
        }
        return matrizReturn;
    }

    public abstract void instanciarObjetos();
}

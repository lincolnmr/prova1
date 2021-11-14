package controller;

import DAO.Persistencia;
import java.util.ArrayList;
import model.ObjetoBase;

public abstract class ControllerBase {            
    protected ObjetoBase objModel;
    protected Persistencia objDAO;

    public ControllerBase() {
        instanciarObjetos();
    }
    
    public void inserir(String[] dados){
        objModel.arrayTo(dados);
        objDAO.insert(objModel);
    }
    
    public void atualizar(String[] dados){
        objModel.arrayTo(dados);
        objDAO.atualizar(objModel);
    }
    
    public void excluir(Integer chave){
        objModel.setId(chave);
        objDAO.excluir(objModel);
    }
    
    public String[] recuperar(Integer chave){     
        ObjetoBase obj = objDAO.recuperar(chave);
        if (obj != null)
            return obj.toArray();
        else
            return new String[1];
    }
    
    public String[][] recuperarTodos(int quantColunas){
        ArrayList<ObjetoBase> lista = objDAO.recuperarTodos();
        String[][] matrizReturn = null;
        matrizReturn = new String[lista.size()][quantColunas];
        
        for (int i = 0; i < lista.size(); i++) {
            matrizReturn[i] = lista.get(i).toArray();
        }
        return matrizReturn;
    }
    
    public abstract void instanciarObjetos();
}

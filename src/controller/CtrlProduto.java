package controller;

import DAO.DAOProduto;
import model.Produto;

public class CtrlProduto extends ControllerBase{

    @Override
    public void instanciarObjetos() {
        objModel = new Produto();
        objDAO = new DAOProduto();
    } 
}

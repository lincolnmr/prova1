package controller;

import DAO.DAOContratarProduto;
import model.ContratarProduto;

public class CtrlContratarProduto extends ControllerBase{

    @Override
    public void instanciarObjetos() {
        objModel = new ContratarProduto();
        objDAO = new DAOContratarProduto();
    }
    
}

package controller;

import DAO.DAOTipoProduto;
import model.TipoProduto;

public class CtrlTipoProduto extends ControllerBase{

    @Override
    public void instanciarObjetos() {
        objModel = new TipoProduto();
        objDAO = new DAOTipoProduto();
    }   
}

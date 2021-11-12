package controller;

import DAO.DAOExtrato;
import model.Extrato;

public class CtrlExtrato extends ControllerBase {

    @Override
    public void instanciarObjetos() {
        objModel = new Extrato();
        objDAO =  new DAOExtrato();
    }
    
}

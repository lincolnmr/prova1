package controller;

import DAO.DAOConta;
import model.Conta;

public class CtrlConta extends ControllerBase {

    @Override
    public void instanciarObjetos() {
        objModel = new Conta();
        objDAO = new DAOConta();        
    }
    
}

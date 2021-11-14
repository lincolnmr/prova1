package controller;

import DAO.DAOConta;
import javax.swing.JTextField;
import model.Conta;

public class CtrlConta extends ControllerBase {

    @Override
    public void instanciarObjetos() {
        objModel = new Conta();
        objDAO = new DAOConta();        
    }
    
}

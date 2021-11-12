package controller;

import DAO.DAOClientes;
import model.Clientes;

public class CtrlClientes extends ControllerBase{

    @Override
    public void instanciarObjetos() {
        objModel = new Clientes();
        objDAO = new DAOClientes();
    }
    
}

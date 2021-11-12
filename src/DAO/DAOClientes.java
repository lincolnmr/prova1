package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Clientes;
import model.ObjetoBase;

public class DAOClientes extends Persistencia  {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_CLIENTES");
        setCampoChave("cli_codigo");
        String[] meusCampos = new String[10];
        meusCampos[0] = "cli_codigo";
        meusCampos[1] = "cli_nome";
        meusCampos[2] = "cli_cpf";
        meusCampos[3] = "cli_rg";
        meusCampos[4] = "cli_cnpj";
        meusCampos[5] = "cli_inscr_estadual";
        meusCampos[6] = "cli_endereco";
        meusCampos[7] = "cli_cidade";
        meusCampos[8] = "cli_telefone";
        meusCampos[9] = "cli_email";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Clientes clientes = (Clientes)obj;
        ST.setInt(1, clientes.getCodigo());
        ST.setString(2, clientes.getNome());
        ST.setString(3, clientes.getCpf());
        ST.setString(4, clientes.getRg());
        ST.setString(5, clientes.getCnpj());
        ST.setString(6, clientes.getInscricaoEstadual());
        ST.setString(7, clientes.getEndereco());
        ST.setString(8, clientes.getCidade());
        ST.setString(9, clientes.getTelefone());
        ST.setString(10, clientes.getEmail());
    }   
}

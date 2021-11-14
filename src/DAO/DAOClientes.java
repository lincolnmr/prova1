package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Clientes;
import model.ObjetoBase;

public class DAOClientes extends Persistencia {

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
        Clientes clientes = (Clientes) obj;
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

    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        ArrayList<ObjetoBase> model = new ArrayList<>();
        ArrayList<Clientes> arrayClientes = (ArrayList<Clientes>) (ArrayList<?>) (model);

        while (obj.next()) {
            Clientes cliente = new Clientes();
            cliente.setCodigo(obj.getInt("cli_codigo"));
            cliente.setNome(obj.getString("cli_nome"));
            cliente.setCpf(obj.getString("cli_cpf"));
            cliente.setRg(obj.getString("cli_rg"));
            cliente.setCnpj(obj.getString("cli_cnpj"));
            cliente.setInscricaoEstadual(obj.getString("cli_inscr_estadual"));
            cliente.setEndereco(obj.getString("cli_endereco"));
            cliente.setCidade(obj.getString("cli_cidade"));
            cliente.setTelefone(obj.getString("cli_telefone"));
            cliente.setEmail(obj.getString("cli_email"));
            arrayClientes.add(cliente);
        }
        return arrayClientes;
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Clientes clientes = (Clientes) obj;
        ST.setString(1, clientes.getNome());
        ST.setString(2, clientes.getCpf());
        ST.setString(3, clientes.getRg());
        ST.setString(4, clientes.getCnpj());
        ST.setString(5, clientes.getInscricaoEstadual());
        ST.setString(6, clientes.getEndereco());
        ST.setString(7, clientes.getCidade());
        ST.setString(8, clientes.getTelefone());
        ST.setString(9, clientes.getEmail());
        ST.setInt(10, clientes.getCodigo());
    }

    @Override
    public ObjetoBase recuperar(ResultSet obj) throws SQLException {
        Clientes cliente = new Clientes();
        obj.next();
        cliente.setCodigo(obj.getInt("cli_codigo"));
        cliente.setNome(obj.getString("cli_nome"));
        cliente.setCpf(obj.getString("cli_cpf"));
        cliente.setRg(obj.getString("cli_rg"));
        cliente.setCnpj(obj.getString("cli_cnpj"));
        cliente.setInscricaoEstadual(obj.getString("cli_inscr_estadual"));
        cliente.setEndereco(obj.getString("cli_endereco"));
        cliente.setCidade(obj.getString("cli_cidade"));
        cliente.setTelefone(obj.getString("cli_telefone"));
        cliente.setEmail(obj.getString("cli_email"));
        return cliente;
    }
}

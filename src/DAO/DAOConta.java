package DAO;

import model.Conta;
import model.ObjetoBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOConta extends Persistencia {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_CONTA");
        setCampoChave("con_codigo");
        String[] meusCampos = new String[7];
        meusCampos[0] = "con_codigo";
        meusCampos[1] = "con_descricao";
        meusCampos[2] = "con_numero_conta";
        meusCampos[3] = "con_agencia";
        meusCampos[4] = "con_saldo";
        meusCampos[5] = "con_conta_investimento";
        meusCampos[6] = "con_ativo";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Conta conta = (Conta) obj;
        ST.setInt(1, conta.getCodigo());
        ST.setString(2, conta.getDescricao());
        ST.setString(3, conta.getNumero());
        ST.setString(4, conta.getAgencia());
        ST.setDouble(5, conta.getSaldo());
        ST.setBoolean(6, conta.isContaInvestimento());
        ST.setBoolean(7, conta.isAtivo());
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Conta conta = (Conta) obj;
        ST.setString(1, conta.getDescricao());
        ST.setString(2, conta.getNumero());
        ST.setString(3, conta.getAgencia());
        ST.setDouble(4, conta.getSaldo());
        ST.setBoolean(5, conta.isContaInvestimento());
        ST.setBoolean(6, conta.isAtivo());
        ST.setInt(7, conta.getCodigo());
    }

    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        ArrayList<ObjetoBase> model = new ArrayList<>();
        ArrayList<Conta> contas = (ArrayList<Conta>) (ArrayList<?>) (model);

        while (obj.next()) {
            Conta conta = new Conta();
            conta.setCodigo(obj.getInt("con_codigo"));
            conta.setDescricao(obj.getString("con_descricao"));
            conta.setNumero(obj.getString("con_numero_conta"));
            conta.setAgencia(obj.getString("con_agencia"));
            conta.setSaldo(obj.getDouble("con_saldo"));
            conta.setContaInvestimento(obj.getBoolean("con_conta_investimento"));
            conta.setAtivo(obj.getBoolean("con_ativo"));
            contas.add(conta);
        }
        return contas;
    }

    @Override
    public ObjetoBase recuperar(ResultSet obj) throws SQLException {
        Conta conta = new Conta();
        obj.next();
        conta.setCodigo(obj.getInt("con_codigo"));
        conta.setDescricao(obj.getString("con_descricao"));
        conta.setNumero(obj.getString("con_numero_conta"));
        conta.setAgencia(obj.getString("con_agencia"));
        conta.setSaldo(obj.getDouble("con_saldo"));
        conta.setContaInvestimento(obj.getBoolean("con_conta_investimento"));
        conta.setAtivo(obj.getBoolean("con_ativo"));
        return conta;
    }
}

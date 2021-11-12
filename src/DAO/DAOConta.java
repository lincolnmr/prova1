package DAO;

import model.Conta;
import model.ObjetoBase;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOConta extends Persistencia {

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

    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Conta conta = (Conta)obj;
        ST.setInt(1, conta.getCodigo());
        ST.setString(2, conta.getDescricao());
        ST.setString(3, conta.getNumero());
        ST.setString(4, conta.getAgencia());
        ST.setDouble(5, conta.getSaldo());
        ST.setBoolean(6, conta.isContaInvestimento());
        ST.setBoolean(7, conta.isAtivo());
    }
}

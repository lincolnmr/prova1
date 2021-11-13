package DAO;

import model.ObjetoBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.Extrato;

public class DAOExtrato extends Persistencia {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_EXTRATO");
        setCampoChave("ext_codigo");
        String[] meusCampos = new String[6];
        meusCampos[0] = "ext_codigo";
        meusCampos[1] = "ext_data";
        meusCampos[2] = "ext_descricao";
        meusCampos[3] = "ext_valor";
        meusCampos[4] = "ext_tipo";
        meusCampos[5] = "ext_cod_conta";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Extrato extrato = (Extrato)obj;
        ST.setInt(1, extrato.getCodigo());
        ST.setTimestamp(2, new Timestamp(extrato.getData().getTimeInMillis()));
        ST.setString(3, extrato.getDescricao());
        ST.setDouble(4, extrato.getValor());
        ST.setString(5, extrato.getTipo());
        ST.setInt(6, extrato.getCodigoConta());
    }
    
    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        return null;
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Extrato extrato = (Extrato)obj;
        ST.setTimestamp(1, new Timestamp(extrato.getData().getTimeInMillis()));
        ST.setString(2, extrato.getDescricao());
        ST.setDouble(3, extrato.getValor());
        ST.setString(4, extrato.getTipo());
        ST.setInt(5, extrato.getCodigoConta());
        ST.setInt(6, extrato.getCodigo());
    }
}

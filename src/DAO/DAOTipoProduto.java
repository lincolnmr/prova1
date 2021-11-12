package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ObjetoBase;
import model.TipoProduto;

public class DAOTipoProduto extends Persistencia  {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_TIPO_PRODUTO");
        setCampoChave("tipo_codigo");
        String[] meusCampos = new String[4];
        meusCampos[0] = "tipo_codigo";
        meusCampos[1] = "tipo_nome";
        meusCampos[2] = "tipo_modalidade";
        meusCampos[3] = "tipo_taxa_rentabilidade";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        TipoProduto tipoProduto = (TipoProduto)obj;
        ST.setInt(1, tipoProduto.getCodigo());
        ST.setString(2, tipoProduto.getNome());
        ST.setString(3, tipoProduto.getModalidade());
        ST.setDouble(4, tipoProduto.getTaxaRentabilidade());
    }
}

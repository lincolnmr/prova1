package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import model.ContratarProduto;
import model.ObjetoBase;

public class DAOContratarProduto extends Persistencia  {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_CONTRATA_PRODUTO");
        setCampoChave("contr_codigo");
        String[] meusCampos = new String[6];
        meusCampos[0] = "contr_codigo";
        meusCampos[1] = "contr_cod_cliente";
        meusCampos[2] = "contr_cod_produto";
        meusCampos[3] = "contr_data_contratacao";
        meusCampos[4] = "contr_data_liquidacao";
        meusCampos[5] = "contr_conta_associada";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        ContratarProduto contrataProduto = (ContratarProduto)obj;
        ST.setInt(1, contrataProduto.getCodigo());
        ST.setInt(2, contrataProduto.getCodigoCliente());
        ST.setInt(3, contrataProduto.getCodigoProduto());
        ST.setTimestamp(4, new Timestamp(contrataProduto.getDataContratacao().getTimeInMillis()));
        ST.setTimestamp(5, new Timestamp(contrataProduto.getDataLiquidacao().getTimeInMillis()));
        ST.setInt(6, contrataProduto.getCodigoConta());
    }
}

package DAO;

import Utilitario.Funcoes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
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
    
    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        ArrayList<ObjetoBase> model = new ArrayList<>();
        ArrayList<ContratarProduto> arrayContrProd = (ArrayList<ContratarProduto>)(ArrayList<?>)(model);
        
        while(obj.next()) {
            ContratarProduto contrProd = new ContratarProduto();
            contrProd.setCodigo(obj.getInt("contr_codigo"));
            contrProd.setCodigoCliente(obj.getInt("contr_cod_cliente"));
            contrProd.setCodigoProduto(obj.getInt("contr_cod_produto"));
            contrProd.setDataContratacao(Funcoes.toCalendar(obj.getDate("contr_data_contratacao")));
            contrProd.setDataLiquidacao(Funcoes.toCalendar(obj.getDate("contr_data_liquidacao")));
            contrProd.setCodigoConta(obj.getInt("contr_conta_associada"));
            arrayContrProd.add(contrProd);
        }
        return arrayContrProd;
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        ContratarProduto contrataProduto = (ContratarProduto)obj;
        ST.setInt(1, contrataProduto.getCodigoCliente());
        ST.setInt(2, contrataProduto.getCodigoProduto());
        ST.setTimestamp(3, new Timestamp(contrataProduto.getDataContratacao().getTimeInMillis()));
        ST.setTimestamp(4, new Timestamp(contrataProduto.getDataLiquidacao().getTimeInMillis()));
        ST.setInt(5, contrataProduto.getCodigoConta());
        ST.setInt(6, contrataProduto.getCodigo());
    }
}

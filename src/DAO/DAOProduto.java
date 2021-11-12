package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import model.ObjetoBase;
import model.Produto;

public class DAOProduto extends Persistencia  {

    @Override
    public void InformarDadosBD() {
        setTabela("TBL_PRODUTO");
        setCampoChave("prod_codigo");
        String[] meusCampos = new String[12];
        meusCampos[0] = "prod_codigo";
        meusCampos[1] = "prod_nome";
        meusCampos[2] = "prod_descricao";
        meusCampos[3] = "prod_capacidade";
        meusCampos[4] = "prod_data_inicio";
        meusCampos[5] = "prod_data_termino";
        meusCampos[6] = "prod_prazo_vencimento";
        meusCampos[7] = "prod_dia_fechamento";
        meusCampos[8] = "prod_valor_min_investimento";
        meusCampos[9] = "prod_taxa_fixa";
        meusCampos[10] = "prod_taxa_operacional";
        meusCampos[11] = "prod_tipo";
        setCampos(meusCampos);
    }

    @Override
    public void mapearParametrosSQL(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Produto produto = (Produto)obj;
        ST.setInt(1, produto.getCodigo());
        ST.setString(2, produto.getNome());
        ST.setString(3, produto.getDescricao());
        ST.setInt(4, produto.getCapacidade());
        ST.setTimestamp(5, new Timestamp(produto.getDataInicio().getTimeInMillis()));
        ST.setTimestamp(6, new Timestamp(produto.getDataTermino().getTimeInMillis()));
        ST.setInt(7, produto.getPrazoVencimento());
        ST.setInt(8, produto.getDiaFechamento());
        ST.setDouble(9, produto.getValorMinInvestimento());
        ST.setDouble(10, produto.getTaxaFixa());
        ST.setDouble(11, produto.getTaxaOperacional());
        ST.setInt(12, produto.getTipoProduto());
    } 
}

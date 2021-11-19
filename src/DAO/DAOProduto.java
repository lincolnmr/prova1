package DAO;

import Facade.FuncoesData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.ObjetoBase;
import model.Produto;

public class DAOProduto extends Persistencia {

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
        Produto produto = (Produto) obj;
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

    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        ArrayList<ObjetoBase> model = new ArrayList<>();
        ArrayList<Produto> arrayProduto = (ArrayList<Produto>) (ArrayList<?>) (model);

        while (obj.next()) {
            Produto produto = new Produto();
            produto.setCodigo(obj.getInt("prod_codigo"));
            produto.setNome(obj.getString("prod_nome"));
            produto.setDescricao(obj.getString("prod_descricao"));
            produto.setCapacidade(obj.getInt("prod_capacidade"));
            produto.setDataInicio(FuncoesData.toCalendar(obj.getDate("prod_data_inicio")));
            produto.setDataTermino(FuncoesData.toCalendar(obj.getDate("prod_data_termino")));
            produto.setPrazoVencimento(obj.getInt("prod_prazo_vencimento"));
            produto.setDiaFechamento(obj.getInt("prod_dia_fechamento"));
            produto.setValorMinInvestimento(obj.getDouble("prod_valor_min_investimento"));
            produto.setTaxaFixa(obj.getDouble("prod_taxa_fixa"));
            produto.setTaxaOperacional(obj.getDouble("prod_taxa_operacional"));
            produto.setTipoProduto(obj.getInt("prod_tipo"));
            arrayProduto.add(produto);
        }
        return arrayProduto;
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        Produto produto = (Produto) obj;
        ST.setString(1, produto.getNome());
        ST.setString(2, produto.getDescricao());
        ST.setInt(3, produto.getCapacidade());
        ST.setTimestamp(4, new Timestamp(produto.getDataInicio().getTimeInMillis()));
        ST.setTimestamp(5, new Timestamp(produto.getDataTermino().getTimeInMillis()));
        ST.setInt(6, produto.getPrazoVencimento());
        ST.setInt(7, produto.getDiaFechamento());
        ST.setDouble(8, produto.getValorMinInvestimento());
        ST.setDouble(9, produto.getTaxaFixa());
        ST.setDouble(10, produto.getTaxaOperacional());
        ST.setInt(11, produto.getTipoProduto());
        ST.setInt(12, produto.getCodigo());
    }

    @Override
    public ObjetoBase recuperar(ResultSet obj) throws SQLException {
        Produto produto = new Produto();
        obj.next();
        produto.setCodigo(obj.getInt("prod_codigo"));
        produto.setNome(obj.getString("prod_nome"));
        produto.setDescricao(obj.getString("prod_descricao"));
        produto.setCapacidade(obj.getInt("prod_capacidade"));
        produto.setDataInicio(FuncoesData.toCalendar(obj.getDate("prod_data_inicio")));
        produto.setDataTermino(FuncoesData.toCalendar(obj.getDate("prod_data_termino")));
        produto.setPrazoVencimento(obj.getInt("prod_prazo_vencimento"));
        produto.setDiaFechamento(obj.getInt("prod_dia_fechamento"));
        produto.setValorMinInvestimento(obj.getDouble("prod_valor_min_investimento"));
        produto.setTaxaFixa(obj.getDouble("prod_taxa_fixa"));
        produto.setTaxaOperacional(obj.getDouble("prod_taxa_operacional"));
        produto.setTipoProduto(obj.getInt("prod_tipo"));
        return produto;
    }
}

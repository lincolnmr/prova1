package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ObjetoBase;
import model.TipoProduto;

public class DAOTipoProduto extends Persistencia {

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
        TipoProduto tipoProduto = (TipoProduto) obj;
        ST.setInt(1, tipoProduto.getCodigo());
        ST.setString(2, tipoProduto.getNome());
        ST.setString(3, tipoProduto.getModalidade());
        ST.setDouble(4, tipoProduto.getTaxaRentabilidade());
    }

    @Override
    public ArrayList<?> mapearModel(ResultSet obj) throws SQLException {
        ArrayList<ObjetoBase> model = new ArrayList<>();
        ArrayList<TipoProduto> arrayTipoProduto = (ArrayList<TipoProduto>) (ArrayList<?>) (model);

        while (obj.next()) {
            TipoProduto tipoProd = new TipoProduto();
            tipoProd.setCodigo(obj.getInt("tipo_codigo"));
            tipoProd.setNome(obj.getString("tipo_nome"));
            tipoProd.setModalidade(obj.getString("tipo_modalidade"));
            tipoProd.setTaxaRentabilidade(obj.getDouble("tipo_taxa_rentabilidade"));
            arrayTipoProduto.add(tipoProd);
        }
        return arrayTipoProduto;
    }

    @Override
    public void mapearUpdate(PreparedStatement ST, ObjetoBase obj) throws SQLException {
        TipoProduto tipoProduto = (TipoProduto) obj;
        ST.setString(1, tipoProduto.getNome());
        ST.setString(2, tipoProduto.getModalidade());
        ST.setDouble(3, tipoProduto.getTaxaRentabilidade());
        ST.setInt(4, tipoProduto.getCodigo());
    }
}

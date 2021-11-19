package model;

import Facade.FuncoesData;
import java.text.ParseException;
import java.util.Calendar;
import org.json.simple.JSONArray;

public class ContratarProduto extends ObjetoBase{
    
    private int codigo;
    private int codigoCliente;
    private int codigoProduto;
    private Calendar dataContratacao;
    private Calendar dataLiquidacao;
    private int codigoConta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Calendar getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Calendar getDataLiquidacao() {
        return dataLiquidacao;
    }

    public void setDataLiquidacao(Calendar dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }

    @Override
    public JSONArray toJson() {
        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add(String.valueOf(getCodigo()));
        arrayJSON.add(String.valueOf(getCodigoCliente()));
        arrayJSON.add(String.valueOf(getCodigoProduto()));
        arrayJSON.add(FuncoesData.dateToString(getDataContratacao()));
        arrayJSON.add(FuncoesData.dateToString(getDataLiquidacao()));
        arrayJSON.add(String.valueOf(getCodigoConta()));
        return arrayJSON;
    }

    @Override
    public ObjetoBase jsonTo(JSONArray dados) {
        setCodigo(Integer.parseInt(String.valueOf(dados.get(0))));
        setCodigoCliente(Integer.parseInt(String.valueOf(dados.get(1))));
        setCodigoProduto(Integer.parseInt(String.valueOf(dados.get(2))));
        try {
            setDataContratacao(FuncoesData.stringToDate(String.valueOf(dados.get(3))));
            setDataLiquidacao(FuncoesData.stringToDate(String.valueOf(dados.get(4))));
        } catch (ParseException ex) {
            System.out.println("Não foi possivel converter data. Model ContratarProduto: " + ex);
        }
        setCodigoConta(Integer.parseInt(String.valueOf(dados.get(5))));
        return this;
    }
    
    @Override
    public String[] preencheTabela() {
        String[] array = new String[6];
        array[0] = String.valueOf(getCodigo());
        array[1] = String.valueOf(getCodigoCliente());
        array[2] = String.valueOf(getCodigoProduto());
        array[3] = FuncoesData.dateToString(getDataContratacao());
        array[4] = FuncoesData.dateToString(getDataLiquidacao());
        array[5] = String.valueOf(getCodigoConta());
        return array;
    }
}

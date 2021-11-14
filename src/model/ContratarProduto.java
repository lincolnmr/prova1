package model;

import Utilitario.Funcoes;
import java.text.ParseException;
import java.util.Calendar;

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
    public String[] toArray() {
        String[] array = new String[6];
        array[0] = String.valueOf(getCodigo());
        array[1] = String.valueOf(getCodigoCliente());
        array[2] = String.valueOf(getCodigoProduto());
        array[3] = Funcoes.dateToString(getDataContratacao());
        array[4] = Funcoes.dateToString(getDataLiquidacao());
        array[5] = String.valueOf(getCodigoConta());
        return array;
    }

    @Override
    public ObjetoBase arrayTo(String[] dados) {
        setCodigo(Integer.parseInt(dados[0]));
        System.out.println("BVCVXC" + dados[1]);
        setCodigoCliente(Integer.parseInt(dados[1]));
        setCodigoProduto(Integer.parseInt(dados[2]));
        try {
            setDataContratacao(Funcoes.stringToDate(dados[3]));
            setDataLiquidacao(Funcoes.stringToDate(dados[4]));
        } catch (ParseException ex) {
            System.out.println("Não foi possivel converter data. Model ContratarProduto: " + ex);
        }
        setCodigoConta(Integer.parseInt(dados[5]));
        return this;
    }
    
    
}

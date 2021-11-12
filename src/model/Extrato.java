package model;

import Utilitario.Funcoes;
import java.text.ParseException;
import java.util.Calendar;

public class Extrato extends ObjetoBase {
    private int codigo;
    private Calendar data;
    private String descricao;
    private double valor;
    private String tipo;
    private int codigoConta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        array[1] = Funcoes.dateToString(getData());
        array[2] = getDescricao();        
        array[3] = String.valueOf(getValor());
        array[4] = getTipo();
        array[5] = String.valueOf(getCodigoConta());
        return array;        
    }

    @Override
    public ObjetoBase arrayTo(String[] dados) {
        setCodigo(Integer.parseInt(dados[0]));
        try {
            setData(Funcoes.stringToDate(dados[1]));
        } catch (ParseException ex) {
             System.out.println("Não foi possivel converter data. Model Extrato: " + ex);
        }
        setDescricao(dados[2]);
        setValor(Double.parseDouble(dados[3]));
        setTipo(dados[4]);
        setCodigoConta(Integer.parseInt(dados[3]));
        return this;
    }  
}

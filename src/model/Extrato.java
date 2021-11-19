package model;

import Facade.FuncoesData;
import java.text.ParseException;
import java.util.Calendar;
import org.json.simple.JSONArray;

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
    public JSONArray toJson() {
        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add(String.valueOf(getCodigo()));
        arrayJSON.add(FuncoesData.dateToString(getData()));
        arrayJSON.add(getDescricao());
        arrayJSON.add(String.valueOf(getValor()));
        arrayJSON.add(getTipo());
        arrayJSON.add(String.valueOf(getCodigoConta()));
        return arrayJSON;
    }

    @Override
    public ObjetoBase jsonTo(JSONArray dados) {
        setCodigo(Integer.parseInt(String.valueOf(dados.get(0))));
        try {
            setData(FuncoesData.stringToDate(String.valueOf(dados.get(1))));
        } catch (ParseException ex) {
            System.out.println("Não foi possivel converter data. Model Extrato: " + ex);
        }
        setDescricao(String.valueOf(dados.get(2)));
        setValor(Double.parseDouble(String.valueOf(dados.get(3))));
        setTipo(String.valueOf(dados.get(4)));
        setCodigoConta(Integer.parseInt(String.valueOf(dados.get(5))));
        return this;
    }

    @Override
    public String[] preencheTabela() {
        String[] array = new String[6];
        array[0] = String.valueOf(getCodigo());
        array[1] = FuncoesData.dateToString(getData());
        array[2] = getDescricao();        
        array[3] = String.valueOf(getValor());
        array[4] = getTipo();
        array[5] = String.valueOf(getCodigoConta());
        return array;        
    }
}

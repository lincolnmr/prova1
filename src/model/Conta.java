package model;

import org.json.simple.JSONArray;

public class Conta extends ObjetoBase {
    private int codigo;
    private String descricao;
    private String numero;
    private String agencia;
    private double saldo;
    private boolean contaInvestimento;
    private boolean ativo;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(boolean contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public JSONArray toJson(){
        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add(String.valueOf(getCodigo()));
        arrayJSON.add(getDescricao());
        arrayJSON.add(getNumero());
        arrayJSON.add(getAgencia());
        arrayJSON.add(String.valueOf(getSaldo()));
        arrayJSON.add(isContaInvestimento() ? "Sim" : "Não");
        arrayJSON.add(isAtivo() ? "Sim" : "Não");
        return arrayJSON;
    }

    @Override
    public ObjetoBase jsonTo(JSONArray dados) {
        setCodigo(Integer.parseInt(String.valueOf(dados.get(0))));
        setDescricao(String.valueOf(dados.get(1)));
        setNumero(String.valueOf(dados.get(2)));
        setAgencia(String.valueOf(dados.get(3)));
        setSaldo(Double.parseDouble(String.valueOf(dados.get(4))));
        setContaInvestimento(Boolean.parseBoolean(String.valueOf(dados.get(5))));
        setAtivo(Boolean.parseBoolean(String.valueOf(dados.get(6))));
        return this;
    }
    
    @Override
    public String[] preencheTabela(){
        String[] array = new String[7];
        array[0] = String.valueOf(getCodigo());
        array[1] = getDescricao();
        array[2] = getNumero();
        array[3] = getAgencia();
        array[4] = String.valueOf(getSaldo());
        array[5] = isContaInvestimento() ? "Sim" : "Não";
        array[6] = isAtivo() ? "Sim" : "Não";
        return array;
    }
}

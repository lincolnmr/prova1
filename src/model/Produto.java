package model;

import Utilitario.Funcoes;
import java.text.ParseException;
import java.util.Calendar;

public class Produto extends ObjetoBase{
    
    private int codigo;
    private String nome;
    private String descricao;
    private int capacidade;
    private Calendar dataInicio;
    private Calendar dataTermino;
    private int prazoVencimento;
    private int diaFechamento;
    private double valorMinInvestimento;
    private double taxaFixa;
    private double taxaOperacional;
    private int tipoProduto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Calendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getPrazoVencimento() {
        return prazoVencimento;
    }

    public void setPrazoVencimento(int prazoVencimento) {
        this.prazoVencimento = prazoVencimento;
    }

    public int getDiaFechamento() {
        return diaFechamento;
    }

    public void setDiaFechamento(int diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public double getValorMinInvestimento() {
        return valorMinInvestimento;
    }

    public void setValorMinInvestimento(double valorMinInvestimento) {
        this.valorMinInvestimento = valorMinInvestimento;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }

    public double getTaxaOperacional() {
        return taxaOperacional;
    }

    public void setTaxaOperacional(double taxaOperacional) {
        this.taxaOperacional = taxaOperacional;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String[] toArray() {
        String[] array = new String[12];
        array[0] = String.valueOf(getCodigo());
        array[1] = getNome();
        array[2] = getDescricao();
        array[3] = String.valueOf(getCapacidade());
        array[4] = Funcoes.dateToString(getDataInicio());
        array[5] = Funcoes.dateToString(getDataTermino());
        array[6] = String.valueOf(getPrazoVencimento());
        array[7] = String.valueOf(getDiaFechamento());
        array[8] = String.valueOf(getValorMinInvestimento());
        array[9] = String.valueOf(getTaxaFixa());
        array[10] = String.valueOf(getTaxaOperacional());
        array[11] = String.valueOf(getTipoProduto());
        return array;  
    }

    @Override
    public ObjetoBase arrayTo(String[] dados) {
        setCodigo(Integer.parseInt(dados[0]));
        setNome(dados[1]);
        setDescricao(dados[2]);
        setCapacidade(Integer.parseInt(dados[3]));
        try {
            setDataInicio(Funcoes.stringToDate(dados[4]));
            setDataTermino(Funcoes.stringToDate(dados[5]));
        } catch (ParseException ex) {
             System.out.println("Não foi possivel converter data. Model Produto: " + ex);
        }
        setPrazoVencimento(Integer.parseInt(dados[6]));
        setDiaFechamento(Integer.parseInt(dados[7]));
        setValorMinInvestimento(Double.parseDouble(dados[8]));
        setTaxaFixa(Double.parseDouble(dados[9]));
        setTaxaOperacional(Double.parseDouble(dados[10]));
        setTipoProduto(Integer.parseInt(dados[11]));
        return this;
    }
}

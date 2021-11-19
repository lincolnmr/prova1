package model;

import org.json.simple.JSONArray;

public class TipoProduto extends ObjetoBase{
    
    private int codigo;
    private String nome;
    private String modalidade;
    private double taxaRentabilidade;

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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public double getTaxaRentabilidade() {
        return taxaRentabilidade;
    }

    public void setTaxaRentabilidade(double taxaRentabilidade) {
        this.taxaRentabilidade = taxaRentabilidade;
    }

    @Override
    public JSONArray toJson() {
        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add(String.valueOf(getCodigo()));
        arrayJSON.add(getNome());        
        arrayJSON.add(getModalidade());
        arrayJSON.add(String.valueOf(getTaxaRentabilidade()));
        return arrayJSON; 
    }

    @Override
    public ObjetoBase jsonTo(JSONArray dados) {
        setCodigo(Integer.parseInt(String.valueOf(dados.get(0))));
        setNome(String.valueOf(dados.get(1)));
        setModalidade(String.valueOf(dados.get(2)));
        setTaxaRentabilidade(Double.parseDouble(String.valueOf(dados.get(3))));
        return this;
    }
    
    public String[] preencheTabela() {
        String[] array = new String[4];
        array[0] = String.valueOf(getCodigo());
        array[1] = getNome();        
        array[2] = getModalidade();
        array[3] = String.valueOf(getTaxaRentabilidade());
        return array; 
    }
}

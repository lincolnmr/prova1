package model;

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
    public String[] toArray() {
        String[] array = new String[4];
        array[0] = String.valueOf(getCodigo());
        array[1] = getNome();        
        array[2] = getModalidade();
        array[3] = String.valueOf(getTaxaRentabilidade());
        return array; 
    }

    @Override
    public ObjetoBase arrayTo(String[] dados) {
        setCodigo(Integer.parseInt(dados[0]));
        setNome(dados[1]);
        setModalidade(dados[2]);
        setTaxaRentabilidade(Double.parseDouble(dados[3]));
        return this;
    }
}

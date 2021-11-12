package model;

public class Clientes extends ObjetoBase{

    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String cnpj;
    private String inscricaoEstadual;
    private String endereco;
    private String cidade;
    private String telefone;
    private String email;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String[] toArray() {
        String[] array = new String[10];
        array[0] = String.valueOf(getCodigo());
        array[1] = getNome();
        array[2] = getCpf();
        array[3] = getRg();
        array[4] = getCnpj();
        array[5] = getInscricaoEstadual();
        array[6] = getEndereco();
        array[7] = getCidade();
        array[8] = getTelefone();
        array[9] = getEmail();
        return array;
    }

    @Override
    public ObjetoBase arrayTo(String[] dados) {
        setCodigo(Integer.parseInt(dados[0]));
        setNome(dados[1]);
        setCpf(dados[2]);
        setRg(dados[3]);
        setCnpj(dados[4]);
        setInscricaoEstadual(dados[5]);
        setEndereco(dados[6]);
        setCidade(dados[7]);
        setTelefone(dados[8]);
        setEmail(dados[9]);
        return this;
    } 
}

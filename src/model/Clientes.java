package model;

import org.json.simple.JSONArray;

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
    public JSONArray toJson() {
        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add(String.valueOf(getCodigo()));
        arrayJSON.add(getNome());
        arrayJSON.add(getCpf());
        arrayJSON.add(getRg());
        arrayJSON.add(getCnpj());
        arrayJSON.add(getInscricaoEstadual());
        arrayJSON.add(getEndereco());
        arrayJSON.add(getCidade());
        arrayJSON.add(getTelefone());
        arrayJSON.add(getEmail());
        return arrayJSON;
    }

    @Override
    public ObjetoBase jsonTo(JSONArray dados) {
        setCodigo(Integer.parseInt(String.valueOf(dados.get(0))));
        setNome(String.valueOf(dados.get(1)));
        setCpf(String.valueOf(dados.get(2)));
        setRg(String.valueOf(dados.get(3)));
        setCnpj(String.valueOf(dados.get(4)));
        setInscricaoEstadual(String.valueOf(dados.get(5)));
        setEndereco(String.valueOf(dados.get(6)));
        setCidade(String.valueOf(dados.get(7)));
        setTelefone(String.valueOf(dados.get(8)));
        setEmail(String.valueOf(dados.get(9)));
        return this;
    }
    
    @Override
    public String[] preencheTabela() {
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
}

package model;

import org.json.simple.JSONArray;

public abstract class ObjetoBase {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract JSONArray toJson();
    
    public abstract ObjetoBase jsonTo(JSONArray dados);
    
    public abstract String[] preencheTabela();
    
}
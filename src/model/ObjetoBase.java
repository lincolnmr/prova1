package model;

public abstract class ObjetoBase {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract String[] toArray();
    
    public abstract ObjetoBase arrayTo(String[] dados);
}

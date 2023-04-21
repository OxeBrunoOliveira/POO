package FABRICA;

public abstract class Movel {
    private String nome;


    Movel(String nome){
        
    }


    public String getNome(){
        return nome;
    }
    public void setNone(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "Movel [nome = " + nome + "]";
    }
}


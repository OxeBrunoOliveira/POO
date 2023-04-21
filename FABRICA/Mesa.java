package FABRICA;

public class Mesa extends Movel {
    private int tamanho;

    Mesa(String nome, int tamanho){
        super(nome);
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Cadeira [ Tamanho = " + tamanho + ", nome " + super.getNome() + "]";
    }
}

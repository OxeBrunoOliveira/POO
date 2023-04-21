package FABRICA;

public class Sofa extends Movel{
    private int numLugares;

    Sofa(String nome, int numLugares){
        super(nome);
        this.numLugares = numLugares;
    }

    public int getNumLugares(){
        return numLugares;
    }
    public void setNumLugares(int numLugares){
        this.numLugares = numLugares;
    }

    @Override
    public String toString(){
        return "Cadeira [ numLugares = " + numLugares + ", nome " + super.getNome() + "]";
    }
}

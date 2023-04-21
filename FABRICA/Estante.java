package FABRICA;

public class Estante extends Movel{
    private int numPrateleiras;

    Estante(String nome, int numPrateleiras){
        super(nome);
        this.numPrateleiras = numPrateleiras;
    }

    public int getNumPrateleiras(){
        return numPrateleiras;
    }
    public void setComBranco(int numPrateleiras){
        this.numPrateleiras = numPrateleiras;
    }

    @Override
    public String toString(){
        return "Cadeira [ numPrateleiras = " + numPrateleiras + ", nome " + super.getNome() + "]";
    }
}

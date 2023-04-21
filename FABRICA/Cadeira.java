package FABRICA;

public  class Cadeira extends Movel{
    private boolean comBraco;

    Cadeira(String nome, boolean comBraco){
        super(nome);
        this.comBraco = false;
    }


    public boolean setComBranco(){
        return comBraco;
    }
    public void getComBranco(boolean comBraco){
        this.comBraco = comBraco;
    }

    @Override
    public String toString(){
        return "Cadeira [ comBraco = " + comBraco + ", nome " + super.getNome() + "]";
    }

    public boolean isComBraco(){
        return comBraco;
    }
}

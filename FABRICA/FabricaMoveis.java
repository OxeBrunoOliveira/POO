package FABRICA;

import java.security.Principal;

public class FabricaMoveis {
    private static  int numCadeiras;
    private static int numMesas;
    private static int numEstantes;
    private static int numSofas;

    FabricaMoveis(){

    }

    public static Cadeira fazerCadeira(String nome, boolean temBraco){
        numCadeiras ++;
        return new Cadeira(nome, temBraco);
    }

    public static Mesa fazerMesa(String nome, int tamanho){
        numMesas ++;
        return new Mesa(nome, tamanho);
    }

    public static Estante fazerEstamte(String nome, int numPrateleiras){
        numEstantes ++;
        return new Estante(nome, numPrateleiras);
    }

    public static Sofa fazerSofa(String nome, int numLugares){
        numSofas ++;
        return new Sofa(nome, numLugares);
    }

    
    public static int getNumCadeiras(){
        return numCadeiras;
    }
    public static void setNumCadeiras(int numCadeiras){
        FabricaMoveis.numCadeiras = numCadeiras;
    }

    public static int getnumMesas(){
        return numMesas;
    }
    public static void setNumMesas(int numMesas){
        FabricaMoveis.numMesas = numMesas;
    }

    public static int getNumEstantes(){
        return numEstantes;
    }
    public static void setNumEstantes(int numEstantes){
        FabricaMoveis.numEstantes = numEstantes;
    }

    public static int getNumSofas(){
        return numSofas;
    }
    public static void setNumSofas(int numSofas){
        FabricaMoveis.numSofas = numSofas;
    }
}

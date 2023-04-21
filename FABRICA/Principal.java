package FABRICA;

public class Principal {
    public static void main(String[] args) {
        FabricaMoveis.fazerSofa("Sofa 01", 3);
        FabricaMoveis.fazerSofa("Sofa 02", 2);
        System.out.println("Total = " + FabricaMoveis.getNumSofas());

        FabricaMoveis.fazerMesa("Mesa 01", 2);
        FabricaMoveis.fazerMesa("Mesa 02", 2);
        System.out.println("Total = " + FabricaMoveis.getnumMesas());

        FabricaMoveis.fazerCadeira("Cadeira 01", false);
        FabricaMoveis.fazerCadeira("Cadeira 02", true);
        System.out.println("Total = " + FabricaMoveis.getNumCadeiras());

        FabricaMoveis.fazerEstamte("Estante 01", 3);
        FabricaMoveis.fazerEstamte("Estante 02", 2);
        System.out.println("Total = " + FabricaMoveis.getNumEstantes());
    }
}

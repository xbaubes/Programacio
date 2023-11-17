public class Concessionari {

    public static void main(String[] args) {

        Cotxe cotxeNormal = new Cotxe("seat");
        CotxeEsportiu cotxeEsportiu = new CotxeEsportiu("audi");

        // Tractar-los com a objectes de la classe pare
        Cotxe cotxe1 = cotxeNormal;
        Cotxe cotxe2 = cotxeEsportiu;
        
        System.out.println(cotxe1.getMarca()); // Crida al mètode de Cotxe
        System.out.println(cotxe2.getMarca()); // Crida al mètode de CotxeEsportiu

        cotxe1.accelerar(); // Crida al mètode de Cotxe
        cotxe2.accelerar(); // Crida al mètode de CotxeEsportiu
        
        cotxe1.frenar(); // Crida al mètode de Cotxe
        cotxe2.frenar(); // Crida al mètode de CotxeEsportiu
        
        cotxeEsportiu.augmentarPotencia();
    }
}

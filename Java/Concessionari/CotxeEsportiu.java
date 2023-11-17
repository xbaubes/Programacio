public class CotxeEsportiu extends Cotxe {
    // Atribut addicional
    int potencia;

    // Constructor
    public CotxeEsportiu(String marca) {
        super(marca); // Usa el constructor de la classe pare
    }
    
    // Mètodes
    @Override
    public void accelerar() {
        System.out.println("accelera esportiu");
    }

    // Mètode addicional
    public void augmentarPotencia() {
        // Implementació de l'augment de potència
    }
}

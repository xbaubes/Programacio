public class Cotxe {

    // Atributs
    String marca;
    String model;
    String color;

    // Constructor
    public Cotxe(String marca) {
        this.marca = marca;
    }
    
    // Mètodes
    public void accelerar() {
        System.out.println("accelera cotxe");
    }
    
    public void frenar() {
        System.out.println("frena cotxe");
    }
    
    public String getMarca(){
        return marca;
    }
}

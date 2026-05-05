package sistemaVehiculos;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
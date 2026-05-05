package sistemaVehiculos;

public class Main {
    public static void main(String[] args) {

        Vehiculo carro = new Carro("Kia", "Picanto", 4);
        Vehiculo moto = new Moto("Honda", "PCX 125", "Urbana");

        carro.mostrarInfo();
        System.out.println();
        moto.mostrarInfo();
    }
}
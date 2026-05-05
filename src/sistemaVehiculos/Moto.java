package sistemaVehiculos;

public class Moto extends Vehiculo{
    private String tipo;

    public Moto(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Tipo: " + tipo);
    }
}

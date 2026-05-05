package empleado.modelo;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto{nombre='" + getNombre() + "', salario total=" + calcularSalario() + '}';
    }
}

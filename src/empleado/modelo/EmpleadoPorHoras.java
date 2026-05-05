package empleado.modelo;

public class EmpleadoPorHoras extends Empleado {

    // Atributo propio
    private int horasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String nombre, double precioPorHora, int horasTrabajadas) {
        super(nombre, precioPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Sobrescribe calcularSalario: precio por hora x horas trabajadas
    @Override
    public double calcularSalario() {
        return getSalario() * horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{nombre='" + getNombre() + "', horas=" + horasTrabajadas + ", salario total=" + calcularSalario() + '}';
    }
}

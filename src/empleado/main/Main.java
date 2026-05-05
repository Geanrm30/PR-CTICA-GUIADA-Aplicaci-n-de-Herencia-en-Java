package empleado.main;

import empleado.modelo.EmpleadoPorHoras;
import empleado.modelo.EmpleadoTiempoCompleto;

public class Main {

    public static void main(String[] args) {

        // Empleado de tiempo completo con salario base de 500
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Carlos", 5000);
        System.out.println("--- Empleado Tiempo Completo ---");
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("Salario base: " + emp1.getSalario());

        System.out.println();

        // Empleado por horas con precio de 10 por hora y 40 horas trabajadas
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Maria", 10, 40);
        System.out.println("--- Empleado Por Horas ---");
        System.out.println("Nombre: " + emp2.getNombre());
        System.out.println("Precio por hora: " + emp2.getSalario());
        System.out.println("Horas trabajadas: " + emp2.getHorasTrabajadas());
        System.out.println("Salario total: " + emp2.calcularSalario());
    }
}

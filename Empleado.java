//Ejercicio02y03

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese el número de empleado: ");
        this.numeroEmpleado = scanner.nextInt();
    }

    
    public void verDatos() {
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Número de empleado: " + this.numeroEmpleado);
    }

    public static void main(String[] args) {
        
        Empleado[] empleados = new Empleado[50];

        
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado();
            System.out.println("\nIngrese los datos del empleado " + (i + 1) + ":");
            empleados[i].leerDatos();
        }

        
        System.out.println("\nDatos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println("---------------------------");
        }
    }
}

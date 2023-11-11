//Ejercicio07
//Iba hacerlo por clases asi separado, opte por esta forma para que sea mas sencillo de enviar

import java.util.Date;


class Empleado {
    private String nombre;
    private String apellido;
    private Date fechaContratacion;
    private double salarioBase;

    public Empleado(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void darDeAlta() {
        System.out.println(getRango() + " dado de alta: " + nombre + " " + apellido + " - Salario: " + calcularSalario());
    }

    public void jubilacion() {
        System.out.println(getRango() + " jubilado: " + nombre + " " + apellido);
    }

    public String getRango() {
        return "Empleado";
    }
}


class AccesoBasico extends Empleado {
    public AccesoBasico(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        super(nombre, apellido, fechaContratacion, salarioBase);
    }

    @Override
    public String getRango() {
        return "Acceso Básico";
    }
}


class AccesoSupervisor extends AccesoBasico {
    public AccesoSupervisor(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        super(nombre, apellido, fechaContratacion, salarioBase);
    }

    @Override
    public String getRango() {
        return "Supervisor";
    }
}


class AccesoDirector extends AccesoSupervisor {
    public AccesoDirector(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        super(nombre, apellido, fechaContratacion, salarioBase);
    }

    @Override
    public String getRango() {
        return "Director";
    }
}


class AccesoAdministrativo extends AccesoBasico {
    public AccesoAdministrativo(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        super(nombre, apellido, fechaContratacion, salarioBase);
    }

    @Override
    public String getRango() {
        return "Acceso Administrativo";
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new AccesoBasico("Juan", "Perez", new Date(), 2000);
        Empleado empleado2 = new AccesoSupervisor("Ana", "Gomez", new Date(), 2500);
        Empleado empleado3 = new AccesoDirector("Carlos", "Lopez", new Date(), 3000);
        Empleado empleado4 = new AccesoAdministrativo("Maria", "Rodriguez", new Date(), 2200);

        empleado1.darDeAlta();
        empleado2.darDeAlta();
        empleado3.darDeAlta();
        empleado4.darDeAlta();

        empleado2.jubilacion();
        empleado3.jubilacion();
    }
}



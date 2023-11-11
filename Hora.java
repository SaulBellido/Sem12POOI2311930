//Ejercicio01

import java.util.Scanner;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", this.horas, this.minutos, this.segundos);
    }

    
    public Hora sumarHoras(Hora otraHora) {
        Hora resultado = new Hora();

        resultado.segundos = this.segundos + otraHora.segundos;
        resultado.minutos = this.minutos + otraHora.minutos + resultado.segundos / 60;
        resultado.segundos %= 60;

        resultado.horas = this.horas + otraHora.horas + resultado.minutos / 60;
        resultado.minutos %= 60;

        return resultado;
    }

    public static void main(String[] args) {
        
        Hora hora1 = new Hora(5, 30, 45);
        Hora hora2 = new Hora(2, 15, 20);
        Hora horaNoInicializada = new Hora();

        
        System.out.println("Hora 1:");
        hora1.mostrarHora();

        System.out.println("\nHora 2:");
        hora2.mostrarHora();

       
        horaNoInicializada = hora1.sumarHoras(hora2);

        System.out.println("\nResultado de la suma:");
        horaNoInicializada.mostrarHora();
    }
}



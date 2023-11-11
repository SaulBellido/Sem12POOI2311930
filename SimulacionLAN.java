//Ejercicio06

import java.util.ArrayList;
import java.util.List;

class LAN {
    private List<Nodo> nodos;

    public LAN() {
        this.nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void quitarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public List<Nodo> obtenerNodos() {
        return nodos;
    }

    public void configurarRed(String topologia) {
        

    }

    public void enviarPaquete(Nodo origen, Nodo destino, int tamañoPaquete) {
        System.out.println("Enviando paquete desde " + origen.getId() + " a " + destino.getId() + " con tamaño " + tamañoPaquete + " bytes.");
        
    }

    public void difundirPaquete(Nodo origen, int tamañoPaquete) {
        System.out.println("Difundiendo paquete desde " + origen.getId() + " a todos los nodos con tamaño " + tamañoPaquete + " bytes.");
        
    }

    public double obtenerTiempoMedioPaquete() {
        
        return 0.0;
    }
}

class Nodo {
    private static int contador = 1;
    private int id;

    public Nodo() {
        this.id = contador++;
    }

    public int getId() {
        return id;
    }
}

public class SimulacionLAN {
    public static void main(String[] args) {
        LAN redEstrella = new LAN();
        Nodo nodo1 = new Nodo();
        Nodo nodo2 = new Nodo();
        redEstrella.agregarNodo(nodo1);
        redEstrella.agregarNodo(nodo2);

        
        redEstrella.configurarRed("estrella");

        
        redEstrella.enviarPaquete(nodo1, nodo2, 100); 

        
        redEstrella.difundirPaquete(nodo1, 150); 

        
        double tiempoMedio = redEstrella.obtenerTiempoMedioPaquete();
        System.out.println("Tiempo medio de paquete: " + tiempoMedio + " segundos");
    }
}

//Ejercicio05

public class Cadena {
    private int longitud;
    private String cadena;

    
    public Cadena() {
        this.longitud = 0;
        this.cadena = "";
    }

    
    public Cadena(String cadena) {
        this.longitud = cadena.length();
        this.cadena = cadena;
    }

    
    public int getLongitud() {
        return longitud;
    }

    
    public String getCadena() {
        return cadena;
    }

    
    public void visualizar() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
    }

    
    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return '\0'; 
        }
    }

    public static void main(String[] args) {
        
        Cadena cadena1 = new Cadena();
        Cadena cadena2 = new Cadena("Ejemplo");

        
        System.out.println("Cadena 1:");
        cadena1.visualizar();

        System.out.println("\nCadena 2:");
        cadena2.visualizar();

        
        int posicion = 2;
        System.out.println("\nCarácter en la posición " + posicion + " de Cadena 2: " + cadena2.caracter(posicion));
    }
}

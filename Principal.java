/**
 * Clase Principal
 */
public class Principal {
    /**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {
       Circulo circulo = new Circulo("Circulo", 15);

       circulo.obtenerArea();
       Circulo.obtenerPerimetro();



    }
}

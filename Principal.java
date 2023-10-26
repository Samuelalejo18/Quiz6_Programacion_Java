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
        System.out.println("\n");
        Circulo circulo= new Circulo( "Circulo", "Azul",15);
        circulo.obtenerArea();
        circulo.obtenerPerimetro();
        System.out.println("\n");
        Triangulo triangulo= new Triangulo("Triangulo", "Rojo", 10,20 );
        triangulo.obtenerArea();
        triangulo.obtenerPerimetro();
        System.out.println("\n");
        Rectangulo rectangulo= new Rectangulo("Rectangulo", "verde", 30, 20);
        rectangulo.obtenerArea();
        rectangulo.obtenerPerimetro();
    }
}

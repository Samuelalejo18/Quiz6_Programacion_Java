/**
 * Clase Rectangulo que hereda de FiguraGeometrica.
 */
class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    /**
     * Constructor de la clase Rectangulo.
     *
     * @param lado1
     * @param lado2
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Método para obtener el area del Rectangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }
    /**
     * Método para obtener el perimetro del Rectangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
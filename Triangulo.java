/**
 * Clase Triangulo que hereda de FiguraGeometrica.
 */
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    /**
     * Constructor de la clase Rectangulo.
     *
     * @param base
     * @param altura
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método para obtener el area del Triangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return   (base * altura)/2;
    }
    /**
     * Método para obtener el perimetro del Triangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {

        return  base*3;
    }
}
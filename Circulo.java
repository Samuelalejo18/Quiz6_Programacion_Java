/**
 * Clase Circulo que hereda de FiguraGeometrica.
 */
class  Circulo extends FiguraGeometrica {
    private Double radio;

    /**
     * Constructor de la clase Circulo.
     *
     *
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;

    }
    /**
     * Método para obtener el area del circulo
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    /**
     * Método para obtener el perimetro del circulo
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

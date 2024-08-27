package co.edu.uniquindio;

public enum TipoDeHabitacion {

    SIMPLE(100000),
    DOBLE(190000),
    SUITE(280000);

    public double precioPorNoche;

    /**
     * Constructor del enum Tipo de Habitación
     * @param precioPorNoche
     */
    private TipoDeHabitacion(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    /**
     * Método get para obtener el precio por noche dependiendo el tipo de habitación
     * @return {Object} - Un objecto con el precio por noche de un tipo de habitación
     */
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    /**
     * Método set para modificar el precio por noche dependiendo el tipo de habitación
     * @param precioPorNoche {double} - El precio por noche de un tipo de habitación a modificar
     */
    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }


}

package co.edu.uniquindio;

public enum TipoDeHabitacion {

    SIMPLE(100000),
    DOBLE(190000),
    SUIT(280000);

    public double precioPorNoche;

    private TipoDeHabitacion(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }


}

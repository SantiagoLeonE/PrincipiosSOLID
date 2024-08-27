package co.edu.uniquindio;

public abstract class Servicio {

    public String descripcion;

    /**
     * Constructor de la clase Servicio
     * @param descripcion {string} - La descripción de un servicio
     */
    Servicio(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método abstracto para obtener la descripción de cada servicio
     * @return {Object} - Un objecto con la descripción de un servicio
     */
    public abstract String getDescripcion();

    /**
     * Método abstracto para modificar la descripción de cada servicio
     * @param descripcion {string} - La descripción de un servicio a modificar
     */
    public abstract void setDescripcion(String descripcion);

}
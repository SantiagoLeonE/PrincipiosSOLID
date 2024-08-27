package co.edu.uniquindio;

import javax.swing.JOptionPane;

public class ServicioHabitacion extends Servicio implements IHabitacion, IConsumible {

    public Habitacion habitacionAsociada;

    /**
     * Constructor de la clase ServicioHabitacion
     * @param descripcion {string} - La descripción de un servicio de habitación
     * @param habitacionAsociada {Habitacion} - La habitación asociada a un servicio de habitación
     */
    public ServicioHabitacion(String descripcion, Habitacion habitacionAsociada) {
        super(descripcion);
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Método get para obtener la descripción de un servicio de habitación
     * @return {Object} - Un objecto con la descripción de un servicio de habitación
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método set para modificar la descripción de un servicio de habitación
     * @param descripcion {string} - La descripción de un servicio a modificar
     */
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método get para obtener una habitación asociada a un servicio de habitación
     * @return {Object} Un objecto de tipo Habitación
     */
    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    /**
     * Método set para modificar una habitación asociada a un servicio de habitación
     * @param habitacion {Habitacion} - La habitación asociada a un servicio de habitación a modificar
     */
    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    /**
     * Método toString para mostrar la información de un servicio de habitación
     * @return {Object} - Un objecto con la información de un servicio de habitación
     */
    public String toString() {
        return descripcion;
    }

    /**
     * Implementación del servicio de habitación
     * @return {Object} - Un objecto con la implementación de un servicio de habitación
     */
    @Override
    public String servicioHabitacion() {
        return "Ofreciendo el servicio de habitación...";
    }

    /**
     * Implementación del método consumir en el servicio de habitación
     * @return {Object} - Un objecto con la implementación del método consumir de un servicio de habitación
     */
    @Override
    public String consumir() {
        return "Consumiendo el servicio de la habitacion...";
    }
}

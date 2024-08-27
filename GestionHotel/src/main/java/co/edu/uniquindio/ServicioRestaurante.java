package co.edu.uniquindio;

import javax.swing.*;

public class ServicioRestaurante extends Servicio implements IRestaurante, IConsumible {

    public Habitacion habitacionAsociada;

    /**
     * Constructor de la clase Servicio Restaurante
     * @param descripcion {string} - La descripción del servicio de restaurante
     * @param habitacionAsociada {Habitacion} - La habitación asociada al servicio de restaurante
     */
    public ServicioRestaurante(String descripcion, Habitacion habitacionAsociada) {
        super(descripcion);
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Método get para obtener la descripción del servicio de restaurante
     * @return {Object} - Un objecto con la descripción de un servicio de restaurante
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método set para modificar la descripción de un servicio de restaurante
     * @param descripcion {string} - La descripción de un servicio a modificar
     */
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método get para obtener una habitación asociada a un servicio de restaurante
     * @return {Object} - Un objecto de tipo Habitación asociado a un servicio de restaurante
     */
    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    /**
     * Método set para modificar una habitación asociada a un servicio de restaurante
     * @param habitacion {Habitacion} - La habitación asociada a un servicio de restaurante a modificar
     */
    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    /**
     * Método toString para mostrar la información de un servicio de restaurante
     * @return {Object} - Un objecto con la información de un servicio de restaurante
     */
    public String toString() {
        return descripcion;
    }

    /**
     * Implementación del servicio de restaurante
     * @return {Object} - Un objecto con la implementación de un servicio de restaurante
     */
    @Override
    public String servicioRestaurante() {
        return "Ofreciendo el servicio de restaurante...";
    }

    /**
     * Implementación del método consumir en un servicio de restaurante
     * @return {Object} - Un objecto con la implementación del método consumir en un servicio de restaurante
     */
    @Override
    public String consumir() {
        return "Consumiendo el servicio del restaurante...";
    }
}

package co.edu.uniquindio;

import javax.swing.*;

public class ServicioSpa extends Servicio implements ISpa, IConsumible {

    public Habitacion habitacionAsociada;

    /**
     * Constructor de la clase Servicio Spa
     * @param descripcion {string} - La descripción del servicio de spa
     * @param habitacionAsociada {Habitacion} - La habitación asociada a un servicio de Spa
     */
    public ServicioSpa(String descripcion, Habitacion habitacionAsociada) {
        super(descripcion);
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Método get para obtener la descripción de un servicio de spa
     * @return {Object} - Un objecto con la descripción de un servicio de spa
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método set para modificar la descripción de un servicio de spa
     * @param descripcion {string} - La descripción de un servicio a modificar
     */
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método get para obtener una habitación asociada a un servicio de spa
     * @return {Object} - Un objecto de tipo Habitación asociado a un servicio de spa
     */
    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    /**
     * Método set para modificar una habitación asociada a un servicio de spa
     * @param habitacion {Habitacion} - Una habitación asociada a un servicio de spa a modificar
     */
    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    /**
     * Método toString para obtener la información de un servicio de spa
     * @return {Object} - Un objecto con la información de un servicio de spa
     */
    public String toString() {
        return descripcion;
    }

    /**
     * Implementación del servicio de spa
     * @return {Object} - Un objecto con la implementación de un servicio de spa
     */
    @Override
    public String servicioSpa() {
        return "Ofreciendo el servicio de spa...";
    }

    /**
     * Implementación del método consumir en un servicio de spa
     * @return {Object} - Un objecto con la implementación del método consumir de un servicio de spa
     */
    @Override
    public String consumir() {
        return "Consumiendo el servicio de spa...";
    }
}

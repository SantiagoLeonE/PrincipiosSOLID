package co.edu.uniquindio;

import javax.swing.*;

public class ServicioLimpieza extends Servicio implements ILimpieza {

    public Habitacion habitacionAsociada;

    /**
     * Constructor de la clase Servicio de Limpieza
     * @param descripcion {string} - La descripción del servicio de limpieza
     * @param habitacionAsociada {Habitacion} La habitación asociada al servicio de limpieza
     */
    public ServicioLimpieza(String descripcion, Habitacion habitacionAsociada) {
        super(descripcion);
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Método get para obtener la descripción de un servicio de limpieza
     * @return {Object} - Un objecto con la descripción de un servicio de limpieza
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método set para modificar la descripción de un servicio de limpieza
     * @param descripcion {string} - La descripción de un servicio a modificar
     */
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método get para obtener una habitación asociada a un servicio de limpieza
     * @return {Object} - Un objecto de tipo Habitación asociado a un servicio de limpieza
     */
    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    /**
     * Método set para modificar una habitación asociada a un servicio de limpieza
     * @param habitacion {Habitacion} - La habitación asociada a un servicio de limpieza a modificar
     */
    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    /**
     * Método toString para mostrar la información de un servicio de limpieza
     * @return {Object} - Un objecto con la información de un servicio de limpieza
     */
    public String toString() {
        return descripcion;
    }

    /**
     * Implementación del servicio de limpieza
     * @return {Object} - Un objecto con la implementación de un servicio de limpieza
     */
    @Override
    public String servicioLimpieza() {
        return "Ofreciendo el servicio de limpieza...";
    }
}

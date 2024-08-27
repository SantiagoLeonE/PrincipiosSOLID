package co.edu.uniquindio;

import java.time.Duration;
import java.util.Collection;
import java.util.LinkedList;

public class Habitacion {
    public int numeroHabitacion;
    public TipoDeHabitacion tipoDeHabitacion;
    public Reserva reservaAsociada;
    public ServicioSpa servicioSpaAsociado;
    public ServicioRestaurante servicioRestauranteAsociado;
    public ServicioLimpieza servicioLimpiezaAsociado;
    public ServicioHabitacion servicioHabitacionAsociado;
    public Collection<Servicio> listServiciosAsociados;

    /**
     * Método constructor de la clase Habitación
     * @param numeroHabitacion {int} - El número de habitación
     * @param tipoDeHabitacion {enum} - El tipo de habitación con su respectivo precio
     */
    public Habitacion(int numeroHabitacion, TipoDeHabitacion tipoDeHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.listServiciosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener el número de habitación
     * @return {Object} - Un objecto con el número de una habitación
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * Método set para modificar el número de una habitación
     * @param numeroHabitacion {int} - El número de una habitación a modificar
     */
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    /**
     * Método get para obtener el tipo de una habitación
     * @return {Object} - Un objecto con el tipo de una habitación
     */
    public TipoDeHabitacion getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    /**
     * Método set para modificar el tipo de una habitación
     * @param tipoDeHabitacion {enum} - El tipo de una habitación a modificar
     */
    public void setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    /**
     * Método para asociar un servicio a una habitación
     * @param servicio {Servicio} - El servicio que se va a asociar con una habitación
     */
    public void agregarServicio(Servicio servicio) {
        listServiciosAsociados.add(servicio);
    }

    /**
     * Método para agregar un servicio de tipo Spa a una habitación
     * @param servicioSpa {ServicioSpa} - El servicio de Spa que se va a agregar a una habitación
     */
    public void agregarServicioSpa(ServicioSpa servicioSpa) {
        servicioSpaAsociado = servicioSpa;
    }

    /**
     * Método para agregar un servicio de tipo Restaurante a una habitación
     * @param servicioRestaurante {ServicioRestaurante} - El servicio de Restaurante que se va a agregar a una habitación
     */
    public void agregarServicioRestaurante(ServicioRestaurante servicioRestaurante) {
        servicioRestauranteAsociado = servicioRestaurante;
    }

    /**
     * Método para agregar un servicio de tipo Limpieza a una habitación
     * @param servicioLimpieza {ServicioLimpieza} - El servicio de Limpieza que se va a agregar a una habitación
     */
    public void agregarServicioLimpieza(ServicioLimpieza servicioLimpieza) {
        servicioLimpiezaAsociado = servicioLimpieza;
    }

    /**
     * Método para agregar un servicio de tipo Habitación a una habitación
     * @param servicioHabitacion {ServicioHabitacion} - El servicio de Habitación que se va a agregar a una habitación
     */
    public void agregarServicioHabitacion(ServicioHabitacion servicioHabitacion) {
        servicioHabitacionAsociado = servicioHabitacion;
    }

    /**
     * Método toString para mostrar la información de una habitación
     * @return {Object} - Un objecto con la información de una habitación
     */
    public String toString() {
        return "Habitación: " + numeroHabitacion + ", Tipo de habitacion: " + tipoDeHabitacion + ", Servicios: " + listServiciosAsociados;
    }

}

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

    public Habitacion(int numeroHabitacion, TipoDeHabitacion tipoDeHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.listServiciosAsociados = new LinkedList<>();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoDeHabitacion getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public void agregarServicio(Servicio servicio) {
        listServiciosAsociados.add(servicio);
    }

    public void agregarServicioSpa(ServicioSpa servicioSpa) {
        servicioSpaAsociado = servicioSpa;
    }

    public void agregarServicioRestaurante(ServicioRestaurante servicioRestaurante) {
        servicioRestauranteAsociado = servicioRestaurante;
    }

    public void agregarServicioLimpieza(ServicioLimpieza servicioLimpieza) {
        servicioLimpiezaAsociado = servicioLimpieza;
    }

    public void agregarServicioHabitacion(ServicioHabitacion servicioHabitacion) {
        servicioHabitacionAsociado = servicioHabitacion;
    }

    public String toString() {
        return "Habitación: " + numeroHabitacion + ", Tipo de habitacion: " + tipoDeHabitacion + ", Servicios: " + listServiciosAsociados;
    }

}

package co.edu.uniquindio;

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
    public Collection<Servicio> serviciosAsociados;

    public Habitacion(int numeroHabitacion, TipoDeHabitacion tipoDeHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.serviciosAsociados = new LinkedList<>();
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

}

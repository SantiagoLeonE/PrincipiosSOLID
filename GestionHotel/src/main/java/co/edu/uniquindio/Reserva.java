package co.edu.uniquindio;

import java.time.LocalDate;

public class Reserva {
    public Cliente clienteAsociado;
    public Habitacion habitacionAsociada;
    public LocalDate fechaEntrada;
    public LocalDate fechaSalida;

    public Reserva(Cliente clienteAsociado, Habitacion habitacionAsociada, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.clienteAsociado = clienteAsociado;
        this.habitacionAsociada = habitacionAsociada;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setCliente(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacion(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}

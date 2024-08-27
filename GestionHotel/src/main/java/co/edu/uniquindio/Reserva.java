package co.edu.uniquindio;

import java.time.LocalDateTime;

public class Reserva {
    public Cliente clienteAsociado;
    public Habitacion habitacionAsociada;
    public LocalDateTime fechaEntrada;
    public LocalDateTime fechaSalida;

    public Reserva(Cliente clienteAsociado, Habitacion habitacionAsociada, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
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

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String toString() {
        return "Habitación: " + habitacionAsociada + ", Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida;
    }
}

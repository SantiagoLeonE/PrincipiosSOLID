package co.edu.uniquindio;

import java.time.LocalDateTime;

public class Reserva {
    public Cliente clienteAsociado;
    public Habitacion habitacionAsociada;
    public LocalDateTime fechaEntrada;
    public LocalDateTime fechaSalida;

    /**
     * Constructor de la clase Reserva
     * @param clienteAsociado {Cliente} - El cliente asociado a una reserva
     * @param habitacionAsociada {Habitacion} - La habitación asociada a una reserva
     * @param fechaEntrada {LocalDate} - La fecha de entrada registrada a una reserva
     * @param fechaSalida {LocalDate} - La fecha de salida registrada a una reserva
     */
    public Reserva(Cliente clienteAsociado, Habitacion habitacionAsociada, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.clienteAsociado = clienteAsociado;
        this.habitacionAsociada = habitacionAsociada;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    /**
     * Método get para obtener un cliente asociado a una reserva
     * @return {Object} - Un objecto de tipo cliente asociado a una reserva
     */
    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    /**
     * Método para modificar el cliente asociado a una reserva
     * @param clienteAsociado {Cliente} - El cliente asociado a una reserva a modificar
     */
    public void setCliente(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    /**
     * Método get para obtener una habitación asociada a una reserva
     * @return {Object} - Un objecto de tipo Habitación asociada a una reserva
     */
    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    /**
     * Método set para modificar una habitación asociada a una reserva
     * @param habitacionAsociada {Habitacion} - La habitación asociada a una reserva a modificar
     */
    public void setHabitacion(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Método get para obtener la fecha de entrada registrada en una reserva
     * @return {Object} - Un objecto con la fecha de entrada registrada en una reserva
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Método set para modificar una fecha de entrada registrada en una reserva
     * @param fechaEntrada {LocalDate} - La fecha de entrada registrada en una reserva a modificar
     */
    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Método get para obtener una fecha de salida registrada en una reserva
     * @return {Object} - Un objecto con la fecha de salida registrada en una reserva
     */
    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Método set para modificar una fecha de salida registrada en una reserva
     * @param fechaSalida {LocalDate} - La fecha de salida registrada en una reserva a modificar
     */
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Método toString para mostrar la información de una reserva
     * @return {Object} - Un objecto con la información de una reserva
     */
    public String toString() {
        return "Habitación: " + habitacionAsociada + ", Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida;
    }
}

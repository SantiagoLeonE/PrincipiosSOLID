package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Cliente {
    public String nombre;
    public String dni;
    public Collection<Reserva> listReservasActivas;

    /**
     * Constructor de la clase Cliente
     * @param nombre {string} - El nombre del cliente
     * @param dni {string} - El dni del cliente
     */
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listReservasActivas = new LinkedList<>();
    }

    /**
     * Método get para obtener el nombre de un cliente
     * @return {Object} - Un objeto con el nombre de un cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre de un cliente
     * @param nombre {string} - El nombre de un cliente a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener el dni de un cliente
     * @return {Object} - Un objeto con el dni de un cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método set para modificar el dni de un cliente
     * @param dni {string} - El dni de un cliente a modificar
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método get para obtener una lista de reservas activas asociadas a un cliente
     * @return {Collection} - Una lista con las reservas activas de un cliente
     */
    public Collection<Reserva> getListReservas() {
        return listReservasActivas;
    }

    /**
     * Método para agregar una reserva a la lista de reservas activas
     * @param reserva {Reserva} - La reserva que se va a agregar a la lista de reservas activas
     */
    public void agregarReserva(Reserva reserva) {
        listReservasActivas.add(reserva);
    }

    /**
     * Método toString para mostrar la información de un cliente
     * @return {Object} - Un objeto con la información de un cliente
     */
    public String toString() {
        return nombre + ", DNI: " + dni;
    }
}

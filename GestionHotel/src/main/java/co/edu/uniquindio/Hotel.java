package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Hotel {

    public String nombre;
    public Collection<Reserva> listReservas;
    public Collection<Habitacion> listHabitaciones;
    public ServicioSpa servicioSpa;
    public ServicioRestaurante servicioRestaurante;
    public ServicioLimpieza servicioLimpieza;
    public ServicioHabitacion servicioHabitacion;
    public Collection<Cliente> listClientes;

    /**
     * Constructor de la clase Hotel
     * @param nombre {string} - El nombre del hotel
     */
    public Hotel(String nombre) {
        this.nombre = nombre;
        this.listReservas = new LinkedList<>();
        this.listHabitaciones = new LinkedList<>();
        this.listClientes = new LinkedList<>();
    }

    /**
     * Método get para obtener el nombre de un hotel
     * @return {Object} - Un objecto con el nombre de un hotel
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre de un hotel
     * @param nombre {string} - El nombre de un hotel a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para agregar una reserva a un hotel
     * @param reserva {Reserva} - La reserva que se va a agregar con un hotel
     */
    public void agregarReserva(Reserva reserva) {
        listReservas.add(reserva);
    }

    /**
     * Método get para obtener una lista de reservas de un hotel
     * @return {Collection} - Una lista con las reservas del hotel
     */
    public Collection<Reserva> getListReservas() {
        return listReservas;
    }

    /**
     * Método para agregar una habitación a un hotel
     * @param habitacion {Habitacion} - La habitación que se va a agregar a un hotel
     */
    public void agregarHabitacion(Habitacion habitacion) {
        listHabitaciones.add(habitacion);
    }

    /**
     * Método para obtener una lista de habitaciones de un hotel
     * @return {Collection} - Una lista con las habitaciones del hotel
     */
    public Collection <Habitacion> getListHabitaciones() {
        return listHabitaciones;
    }

    /**
     * Método para agregar un cliente a un hotel
     * @param cliente {Cliente} - El cliente que se va a agregar a un hotel
     */
    public void agregarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

    /**
     * Método para obtener una lista de clientes de un hotel
     * @return {Collection} - Una lista con los clientes del hotel
     */
    public Collection<Cliente> getListClientes() {
        return listClientes;
    }
}

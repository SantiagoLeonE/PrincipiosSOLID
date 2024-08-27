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

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.listReservas = new LinkedList<>();
        this.listHabitaciones = new LinkedList<>();
        this.listClientes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarReserva(Reserva reserva) {
        listReservas.add(reserva);
    }

    public Collection<Reserva> getListReservas() {
        return listReservas;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listHabitaciones.add(habitacion);
    }

    public Collection <Habitacion> getListHabitaciones() {
        return listHabitaciones;
    }

    public void agregarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

    public Collection<Cliente> getListClientes() {
        return listClientes;
    }
}

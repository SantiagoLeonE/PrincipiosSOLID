package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Cliente {
    public String nombre;
    public String dni;
    public Collection<Reserva> listReservasActivas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listReservasActivas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Collection<Reserva> getListReservas() {
        return listReservasActivas;
    }

    public void agregarReserva(Reserva reserva) {
        listReservasActivas.add(reserva);
    }
}

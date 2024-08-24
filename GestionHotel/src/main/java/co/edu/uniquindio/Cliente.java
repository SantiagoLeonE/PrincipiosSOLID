package co.edu.uniquindio;

import java.util.Collection;

public class Cliente {
    public String nombre;
    public String dni;
    public Collection<Reserva> listReservas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
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
        return listReservas;
    }

    public void agregarReserva(Reserva reserva) {
        listReservas.add(reserva);
    }
}

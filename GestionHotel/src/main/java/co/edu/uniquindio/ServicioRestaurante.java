package co.edu.uniquindio;

import javax.swing.*;

public class ServicioRestaurante extends Servicio implements IRestaurante, IConsumible {

    public Habitacion habitacionAsociada;

    public ServicioRestaurante(String descripcion, Habitacion habitacionAsociada) {
        super(descripcion);
        this.habitacionAsociada = habitacionAsociada;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    @Override
    public void servicioRestaurante() {
        JOptionPane.showMessageDialog(null, "Ofreciendo el servicio de restaurante...");
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Consumiendo el servicio del restaurante...");
    }
}

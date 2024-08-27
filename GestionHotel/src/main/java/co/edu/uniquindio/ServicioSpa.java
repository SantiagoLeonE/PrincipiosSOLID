package co.edu.uniquindio;

import javax.swing.*;

public class ServicioSpa extends Servicio implements ISpa, IConsumible {

    public Habitacion habitacionAsociada;

    public ServicioSpa(String descripcion, Habitacion habitacionAsociada) {
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
    public void servicioSpa() {
        JOptionPane.showMessageDialog(null, "Ofreciendo el servicio de spa...");
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Consumiendo el servicio de spa...");
    }
}

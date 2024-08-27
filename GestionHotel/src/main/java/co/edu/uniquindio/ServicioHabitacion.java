package co.edu.uniquindio;

import javax.swing.*;

public class ServicioHabitacion extends Servicio implements IHabitacion, IConsumible {

    public Habitacion habitacionAsociada;

    public ServicioHabitacion(String descripcion, Habitacion habitacionAsociada) {
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
    public void servicioHabitacion() {
        JOptionPane.showMessageDialog(null, "Ofreciendo el servicio de habitación...");
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Consumiendo el servicio de la habitacion...");
    }
}

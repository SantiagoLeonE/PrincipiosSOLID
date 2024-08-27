package co.edu.uniquindio;

import javax.swing.*;

public class ServicioLimpieza extends Servicio implements ILimpieza {

    public Habitacion habitacionAsociada;

    public ServicioLimpieza(String descripcion, Habitacion habitacionAsociada) {
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
    public void servicioLimpieza() {
        JOptionPane.showMessageDialog(null, "Limpiando la habitacion...");
    }
}

package co.edu.uniquindio;

import javax.swing.JOptionPane;

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

    public String toString() {
        return descripcion;
    }

    @Override
    public String servicioHabitacion() {
        return "Ofreciendo el servicio de habitación...";
    }

    @Override
    public String consumir() {
        return "Consumiendo el servicio de la habitacion...";
    }
}

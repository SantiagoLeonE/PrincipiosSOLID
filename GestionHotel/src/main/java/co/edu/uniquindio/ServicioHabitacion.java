package co.edu.uniquindio;

import javax.swing.*;

public class ServicioHabitacion extends Servicio implements ILimpieza{
    @Override
    public void servicioLimpieza() {
        JOptionPane.showMessageDialog(null, "Limpiando la habitacion...");
    }
}

package co.edu.uniquindio;

import javax.swing.*;

public class ServicioRestaurante extends Servicio implements IRestaurante {
    @Override
    public void servicioRestaurante() {
        JOptionPane.showMessageDialog(null, "Servicio Restaurante...");
    }
}

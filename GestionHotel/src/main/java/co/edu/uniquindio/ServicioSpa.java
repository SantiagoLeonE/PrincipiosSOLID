package co.edu.uniquindio;

import javax.swing.*;

public class ServicioSpa extends Servicio implements ISpa {
    @Override
    public void servicioSpa() {
        JOptionPane.showMessageDialog(null, "Servicio Spa...");
    }
}

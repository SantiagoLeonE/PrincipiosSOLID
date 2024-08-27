package co.edu.uniquindio;

import javax.swing.JOptionPane;
import java.time.Duration;
import java.time.LocalDateTime;

public class MainHotel {

    static Hotel hotel = new Hotel("Blu Hotel");

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
    }

    public static void inicializarDatos() {

        Habitacion habitacion1 = new Habitacion(103, TipoDeHabitacion.SIMPLE);
        Habitacion habitacion2 = new Habitacion(207, TipoDeHabitacion.DOBLE);
        Habitacion habitacion3 = new Habitacion(302, TipoDeHabitacion.SIMPLE);
        Habitacion habitacion4 = new Habitacion(405, TipoDeHabitacion.SUITE);

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);
        hotel.agregarHabitacion(habitacion4);

        Cliente cliente1 = new Cliente("Santiago", "1096670477");
        Cliente cliente2 = new Cliente("Sofía", "24933814");
        Cliente cliente3 = new Cliente("Camilo", "1007813082");

        Reserva reserva1 = new Reserva(cliente1, habitacion2, LocalDateTime.of(2024, 8, 27, 9, 0, 0), LocalDateTime.of(2024, 8, 27, 9, 30, 0));
        Reserva reserva2 = new Reserva(cliente2, habitacion1, LocalDateTime.of(2024, 8, 15, 10, 0, 0), LocalDateTime.of(2024, 8, 15, 10, 30, 0));
        Reserva reserva3 = new Reserva(cliente3, habitacion4, LocalDateTime.of(2024, 11, 23, 7, 0, 0), LocalDateTime.of(2024, 11, 23, 7, 30, 0));

        cliente1.agregarReserva(reserva1);
        cliente2.agregarReserva(reserva2);
        cliente3.agregarReserva(reserva3);

        ServicioHabitacion servicioHabitacion = new ServicioHabitacion("Servicio de habitacion", habitacion4);
        ServicioSpa servicioSpa = new ServicioSpa("Servicio de Spa", habitacion4);
        ServicioLimpieza servicioLimpieza = new ServicioLimpieza("Servicio de Limpieza", habitacion4);
        ServicioRestaurante servicioRestaurante = new ServicioRestaurante("Servicio de Restaurante", habitacion4);

        habitacion4.agregarServicio(servicioHabitacion);
        habitacion4.agregarServicio(servicioSpa);
    }

    public static void mostrarMenu() {
        String opcion = "0";
        while(!opcion.equals("2")) {
            String menu = """
                        Menú Gestión Hotel
                        1. Total a pagar por la estancia en el hotel
                        2. Salir
                        """;
            opcion = JOptionPane.showInputDialog(null, menu, "Seleccione una opción", JOptionPane.QUESTION_MESSAGE);

            switch(opcion) {
                case "1":
                    calcularPrecioTotalEstadiaCliente();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        }
    }

    public static void calcularPrecioTotalEstadiaCliente() {
        Habitacion habitacion1 = new Habitacion(103, TipoDeHabitacion.SIMPLE);
        Cliente cliente1 = new Cliente("Santiago", "1096670477");
        Reserva reserva1 = new Reserva(cliente1, habitacion1, LocalDateTime.of(2024, 8, 27, 9, 0, 0), LocalDateTime.of(2024, 8, 30, 12, 0, 0));

        long minutos = Duration.between(reserva1.fechaEntrada, reserva1.fechaSalida).toMinutes();
        double horas = minutos/60.0;
        double dias = horas / 24.0;
        double precioTotal;
        if(dias < 1) {
            precioTotal = habitacion1.tipoDeHabitacion.getPrecioPorNoche();
        }
        else {
            precioTotal = Math.ceil(dias) * habitacion1.tipoDeHabitacion.getPrecioPorNoche();
        }

        JOptionPane.showMessageDialog(null, "El total que debe pagar el cliente " + cliente1.getNombre() + " es: $" + precioTotal + " pesos");
    }

}
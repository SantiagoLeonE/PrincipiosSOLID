package co.edu.uniquindio;

import javax.swing.JOptionPane;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

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

        hotel.agregarCliente(cliente1);
        hotel.agregarCliente(cliente2);
        hotel.agregarCliente(cliente3);

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
        while(!opcion.equals("4")) {
            String menu = """
                        Menú Gestión Hotel
                        1. Total a pagar por la estancia en el hotel
                        2. Obtener lista de habitaciones por un tipo determinado
                        3. Obtener información del cliente por el dni
                        4. Salir
                        """;
            opcion = JOptionPane.showInputDialog(null, menu, "Seleccione una opción", JOptionPane.QUESTION_MESSAGE);

            switch(opcion) {
                case "1":
                    calcularPrecioTotalEstadiaCliente();
                    break;
                case "2":
                    obtenerListaTipoHabitacion();
                    break;
                case "3":
                    obtenerInformacionClientePorDni();
                    break;
                case "4":
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

    public static void obtenerListaTipoHabitacion() {
        String tipoHabitacion = JOptionPane.showInputDialog(null, "Ingrese el tipo de habitación del lista: ");

        TipoDeHabitacion tipoDeHabitacion = TipoDeHabitacion.valueOf(tipoHabitacion.toUpperCase());

        Collection<Habitacion> nuevaLista = new LinkedList<>();
        if(!hotel.getListHabitaciones().isEmpty()) {
            for(Habitacion habitacion : hotel.getListHabitaciones()) {
                if(habitacion.getTipoDeHabitacion() == tipoDeHabitacion) {
                    nuevaLista.add(habitacion);
                }
            }
            JOptionPane.showMessageDialog(null, nuevaLista);
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay habitaciones en el hotel");
        }
    }

    public static void obtenerInformacionClientePorDni() {
        String dniCliente = JOptionPane.showInputDialog(null, "Ingrese el DNI: ");

        if(!hotel.getListClientes().isEmpty()) {
            for(Cliente cliente : hotel.getListClientes()) {
                if(cliente.getDni().equals(dniCliente)) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay clientes en el hotel");
        }
    }
}


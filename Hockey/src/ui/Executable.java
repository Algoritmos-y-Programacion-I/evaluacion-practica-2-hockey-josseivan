package ui;

import java.util.*;
import model.Arbitro;
import model.ArbitroPrincipal;
import model.Controller;
import model.JuezDeLinea;
import model.JugadorHockey;
import model.Posicion;

public class Executable {

    private final Scanner escaner;

    public Executable() {
        escaner = new Scanner(System.in);

        // Crear la lista de jugadores y árbitros
        List<JugadorHockey> jugadores = Arrays.asList(
            new JugadorHockey("Jugador 1", 1, Posicion.DEFENSA),
            new JugadorHockey("Jugador 2", 2, Posicion.ALA),
            new JugadorHockey("Jugador 3", 3, Posicion.CENTRO),
            new JugadorHockey("Jugador 4", 4, Posicion.ALA),
            new JugadorHockey("Jugador 5", 5, Posicion.DEFENSA),
            new JugadorHockey("Portero", 6, Posicion.PORTERO)
        );

        List<Arbitro> arbitros = Arrays.asList(
            new ArbitroPrincipal("Arbitro Principal 1", 45),
            new ArbitroPrincipal("Arbitro Principal 2", 48),
            new JuezDeLinea("Juez de Linea 1", 40),
            new JuezDeLinea("Juez de Linea 2", 42)
        );

        // Inicializar la controladora con listas de jugadores y árbitros
        new Controller(jugadores, arbitros);
    }

    public void run() {
        boolean flag = false;

        while (!flag) {
            System.out.println("\n\nBienvenido al menu:\n");
            System.out.println("Opciones:\n1. Fixture\n2. Precargar informacion\n3. Realizar partido entre 2 equipos\n4. Salir del programa\n");

            int option = escaner.nextInt();

            switch (option) {
                case 1 -> System.out.println("Opción 1 seleccionada: Fixture.");
                // Aquí deberías añadir la lógica correspondiente para la opción 1
                case 2 -> System.out.println("Opción 2 seleccionada: Precargar información.");
                // Aquí deberías añadir la lógica correspondiente para la opción 2
                case 3 -> System.out.println("Opción 3 seleccionada: Realizar partido entre 2 equipos.");
                // Aquí deberías añadir la lógica correspondiente para la opción 3
                case 4 -> {
                    flag = true;
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Por favor ingrese una opción válida.");
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run();
    }
}

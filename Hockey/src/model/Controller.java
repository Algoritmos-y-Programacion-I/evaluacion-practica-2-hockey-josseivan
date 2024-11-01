package model;

import java.util.*;

public class Controller {
    private List<JugadorHockey> jugadores;
    private List<Arbitro> arbitros;

    public Controller(List<JugadorHockey> jugadores, List<Arbitro> arbitros) {
        this.jugadores = jugadores;
        this.arbitros = arbitros;
    }

    public void simularJugadaDeGol() {
        Random random = new Random();
        Set<JugadorHockey> jugadoresParticipantes = new HashSet<>();
        int pases = 0;

        while (pases < 5) {
            
            JugadorHockey jugadorActual = jugadores.get(random.nextInt(jugadores.size()));
            JugadorHockey jugadorDestino;
            do {
                jugadorDestino = jugadores.get(random.nextInt(jugadores.size()));
            } while (jugadorDestino == jugadorActual);

            jugadorActual.pasarDisco(jugadorDestino);
            jugadoresParticipantes.add(jugadorActual);
            jugadoresParticipantes.add(jugadorDestino);
            pases++;

            Arbitro arbitro = arbitros.get(pases % arbitros.size());
            System.out.println(arbitro.desplazarse());
        }

        if (jugadoresParticipantes.size() >= 3 && pases >= 5) {
            JugadorHockey anotador = jugadores.get(random.nextInt(jugadores.size()));
            System.out.println("Jugador " + anotador.numero + " entra el disco en la red. ¡Gol!");
        } else {
            System.out.println("La jugada no cumple con los requisitos para ser un gol.");
        }
    }
}

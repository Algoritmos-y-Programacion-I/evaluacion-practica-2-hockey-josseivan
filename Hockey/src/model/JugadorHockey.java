package model;

public class JugadorHockey extends Persona implements DesplazarseEnPistaConPalo, IPase {
    protected String nombre;
    protected int numero;
    protected Posicion posicion;

    public JugadorHockey(String nombre, int numero, Posicion posicion) {
        super(nombre, numero);
        this.posicion = posicion;
    }

    public void pasarDisco(JugadorHockey destinatario) {
        System.out.println("Jugador numero " + this.numero + " se la pasa a Jugador " + destinatario.numero);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String getNombrePosicion() {
        return posicion.toString();
    }

    public String desplazarseConPalo() {
        if (posicion != Posicion.PORTERO) {
            return nombre + " se desplaza en la pista con el palo.";
        } else {
            return nombre + " es el portero y no se desplaza más allá de media pista.";
        }
    }
}

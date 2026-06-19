
package juego.modelo;

public class Mago extends Personaje {

    public Mago(String nombre, int vida, int ataque, int defensa, int nivel) {
        super(nombre, "Mago", vida, ataque, defensa, nivel);
    }
    
    public int atacar(){
        return ataque + 10;
    }
}

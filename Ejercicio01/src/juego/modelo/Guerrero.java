
package juego.modelo;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida, int ataque, int defensa, int nivel) {
        super(nombre, "Guerrero", vida, ataque, defensa, nivel);
    }
    
    public int atacar(){
        return ataque +5;
    }
}

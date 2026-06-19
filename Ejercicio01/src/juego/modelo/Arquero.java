
package juego.modelo;

public class Arquero extends Personaje{

    public Arquero(String nombre, int vida, int ataque, int defensa, int nivel) {
        super(nombre, "Arquero", vida, ataque, defensa, nivel);
    }
    
    public int atacar(){
        return ataque +7;
    }
}

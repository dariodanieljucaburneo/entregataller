
package juego.modelo;

public abstract class Personaje {
    protected String nombre, tipo;
    protected int vida, ataque, defensa, nivel;

    public Personaje(String nombre, String tipo, int vida, int ataque, int defensa, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }
    
    public abstract int atacar();
    
    public void defender(int daño){
        int dañoFinal = daño - defensa;
        if(dañoFinal < 0){
            dañoFinal = 0;
        }
        vida -= dañoFinal;
    }
    
    public void subirNivel(){
        nivel ++;
        vida += 10;
        ataque += 2;
        ataque += 2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }
    
    @Override
    public String toString(){
        return nombre + "[" + tipo + "]" +
                " | Vida: " + vida +
                " | Nivel: " + nivel +
                " | Ataque: " + ataque +
                " | Defensa: " + defensa;                
    }
}

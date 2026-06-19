
package juego.controlador;

import juego.modelo.*;
import java.util.Random;

public class ControladorJuego {
    private Combate combate;
    private Random rand;

    public ControladorJuego() {
        combate = new Combate();
        rand = new Random();
    }
    
    public void run(){
        Personaje [] personajes = {
            new Guerrero("Kratos", 100, 15, 10, 1),
            new Mago("Gandalf", 80, 20, 5, 1),
            new Arquero("Legolas", 90, 18, 8, 1),
            new Guerrero("Ares", 80, 18, 10, 1),
            new Mago("Merlin", 90, 17, 7, 1),
            new Arquero("Robin", 100, 19, 7, 1)
        };
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n============ COMBATE " + i + "============");
            Personaje p1, p2;
            do {
                p1 = personajes[rand.nextInt(personajes.length)];
                p2 = personajes[rand.nextInt(personajes.length)];
            } while (p1 == p2);
            
            Personaje ganador = combate.pelear(p1, p2);
            
            if(ganador == null){
                System.out.println("RESULTADO: EMPATE");
            } else {
                System.out.println("GANADOR: " + ganador.getNombre());
            }
        }
    }
}

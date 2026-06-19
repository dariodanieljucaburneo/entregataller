package ejrestaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        Cuenta cuenta = new Cuenta(nombreCliente);

        int opcion;
        do {
            System.out.println("\n--- MENU DE OPCIONES DEL RESTAURANTE ---");
            System.out.println("1. Agregar Menu a la Carta");
            System.out.println("2. Agregar Menu del Dia");
            System.out.println("3. Agregar Menu de Ninos");
            System.out.println("4. Agregar Menu Economico");
            System.out.println("5. Finalizar Orden y Calcular Cuenta");
            System.out.print("Seleccione una opcion (1-5): ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                    Menu carta = new MenuCarta("Lomo Fino", 15.00, 3.50, 2.00, 10.0);
                    cuenta.agregarMenu(carta);
                    System.out.println("Menu a la Carta (Lomo Fino) agregado con exito!");
                    break;
                    
                case 2:
                    Menu dia = new MenuDia("Seco de Pollo", 4.00, 1.50, 1.00);
                    cuenta.agregarMenu(dia);
                    System.out.println("Menu del Día (Seco de Pollo) agregado con exito!");
                    break;
                    
                case 3:
                    Menu ninos = new MenuNinos("Mini Burger", 5.00, 1.50, 1.50);
                    cuenta.agregarMenu(ninos);
                    System.out.println("Menu de Ninos (Mini Burger) agregado con exito!");
                    break;
                    
                case 4:
                    Menu economico = new MenuEconomico("Almuerzo Ejecutivo", 3.50, 15.0);
                    cuenta.agregarMenu(economico);
                    System.out.println("Menu Economico (Almuerzo Ejecutivo) agregado con exito!");
                    break;
                    
                case 5:
                    System.out.println("\nProcesando orden...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
            }
            
        } while (opcion != 5); 

        cuenta.calcularGranTotal();
        
        System.out.println("\n" + cuenta);
        entrada.close();
    }
}

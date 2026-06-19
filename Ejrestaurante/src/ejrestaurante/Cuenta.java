
package ejrestaurante;

import java.util.ArrayList;

public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> listaMenus; 
    private double subtotal;
    private double iva;
    private double valorTotal;
    private final double PORCENTAJE_IVA = 12.0; 

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = new ArrayList<>();
    }

    public void agregarMenu(Menu m) {
        m.calcularValorMenu(); 
        this.listaMenus.add(m);
    }

    public void calcularGranTotal() {
        this.subtotal = 0;
        for (Menu m : listaMenus) {
            this.subtotal += m.getValorMenu();
        }
        this.iva = this.subtotal * (PORCENTAJE_IVA / 100);
        this.valorTotal = this.subtotal + this.iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("==================================================\n");
        sb.append("               RESTAURANT - FACTURA               \n");
        sb.append("==================================================\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("--------------------------------------------------\n");
        sb.append("Detalle de Consumo:\n");
        
        for (Menu m : listaMenus) {
            sb.append(" - ").append(m.toString()).append("\n");
        }
        
        sb.append("--------------------------------------------------\n");
        sb.append(String.format("Subtotal:         $%.2f\n", subtotal));
        sb.append(String.format("IVA (%.0f%%):       $%.2f\n", PORCENTAJE_IVA, iva));
        sb.append(String.format("TOTAL A CANCELAR: $%.2f\n", valorTotal));
        sb.append("==================================================\n");
        
        return sb.toString();
    }
}

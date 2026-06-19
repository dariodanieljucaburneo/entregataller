
package ejrestaurante;

public class MenuEconomico extends Menu {
    private double porcentajeDescuento; 

    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularValorMenu() {
        double descuento = this.valorInicial * (this.porcentajeDescuento / 100);
        this.valorMenu = this.valorInicial - descuento;
    }

    @Override
    public String toString() {
        return String.format("[Menu Economico] %s, Descuento: %.1f%%", 
                super.toString(), porcentajeDescuento);
    }
}
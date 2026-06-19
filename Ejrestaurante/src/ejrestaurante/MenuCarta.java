
package ejrestaurante;

public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio; 

    public MenuCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
    public void calcularValorMenu() {
        double servicio = this.valorInicial * (this.porcentajeServicio / 100);
        this.valorMenu = this.valorInicial + this.valorGuarnicion + this.valorBebida + servicio;
    }

    @Override
    public String toString() {
        return String.format("[Menu a la Carta] %s, Guarnicion: $%.2f, Bebida: $%.2f, Servicio: %.1f%%", 
                super.toString(), valorGuarnicion, valorBebida, porcentajeServicio);
    }
}

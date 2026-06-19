
package ejrestaurante;

public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = this.valorInicial + this.valorPostre + this.valorBebida;
    }

    @Override
    public String toString() {
        return String.format("[Menu del Dia] %s, Postre: $%.2f, Bebida: $%.2f", 
                super.toString(), valorPostre, valorBebida);
    }
}
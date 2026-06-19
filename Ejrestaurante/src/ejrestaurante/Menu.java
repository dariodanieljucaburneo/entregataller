
package ejrestaurante;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularValorMenu();

    public double getValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("Plato: %s | Valor Inicial: $%.2f | Valor Final: $%.2f", 
                nombrePlato, valorInicial, valorMenu);
    }
}

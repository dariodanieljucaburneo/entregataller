
package ejrestaurante;

public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = this.valorInicial + this.valorHelado + this.valorPastel;
    }

    public String String() {
        return String.format("[Menu de Ninos] %s, Helado: $%.2f, Pastel: $%.2f", 
                super.toString(), valorHelado, valorPastel);
    }
}
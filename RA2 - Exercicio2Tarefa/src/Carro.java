public class Carro extends Veiculo{
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nMarca: " + getMarca() + "\nAno: " + getAno() + "\nPortas: " + getPortas());
    }
}

public class CarroEletrico extends Carro{
    private int autonomiaBateria;

    public int getAutonomiaBateria(){
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nMarca: " + getMarca() + "\nAno: " + getAno() +
                "\nPortas: " + getPortas() + "\nAutonomia da bateria: " + getAutonomiaBateria() + "h");
    }


}

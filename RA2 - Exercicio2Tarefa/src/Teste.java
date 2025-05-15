public class Teste {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setMarca("John Deere");
        v1.setAno(1999);
        v1.mostrarDados();

        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setAno(1987);
        c1.setPortas(4);
        c1.mostrarDados();

        CarroEletrico ce1 = new CarroEletrico();
        ce1.setMarca("BYD");
        ce1.setAno(2019);
        ce1.setPortas(4);
        ce1.setAutonomiaBateria(5);
        ce1.mostrarDados();
    }
}

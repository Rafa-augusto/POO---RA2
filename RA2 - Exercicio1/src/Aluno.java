public class Aluno extends PessoaFisica{
    private String matricula;
    private int numeroDeDisciplinas;
    public Aluno(String nome, String endereco, String numeroCelular, String cpf, String matricula, int numeroDeDisciplinas){
        super(nome, endereco, numeroCelular, cpf);
        this.matricula = matricula;
        this.numeroDeDisciplinas = numeroDeDisciplinas;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroDeDisciplinas(){
        return numeroDeDisciplinas;
    }

    public void setNumeroDeDisciplinas(int numeroDeDisciplinas) {
        this.numeroDeDisciplinas = numeroDeDisciplinas;
    }

    public void mostrarInformacoes(){
        System.out.println("\nNome: " + getNome() + "\nEndereço: "+ getEndereco() +
                "\nNumero do celular: " + getNumeroCelular() + "\nCPF: " + getCpf() +
                "\nMatricula: " + getMatricula() + "\nNúmero de disciplinas: " + getNumeroDeDisciplinas());
    }
}

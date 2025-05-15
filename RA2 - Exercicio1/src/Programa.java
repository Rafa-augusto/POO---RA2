public class Programa {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Rafael", "Rua tal", "4112344321", "12345678901", "444444", 4 );
        Aluno a2 = new Aluno("Douglas", "Rua dois", "4114145432", "13456324512", "115552", 3);
        Aluno a3 = new Aluno("Miguel", "Rua três", "4144457676", "15478675678", "4477812", 5);
        a1.mostrarInformacoes();
        a2.mostrarInformacoes();
        a3.mostrarInformacoes();
    }
}

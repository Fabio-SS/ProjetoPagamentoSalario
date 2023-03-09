public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 1000.0;
        contratoTrabalho.valorHoraExtra = 50.0;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        System.out.println("Salário devido: R$" + folhaPagamento.calcularSalario(5,2, contratoTrabalho));
    }
}
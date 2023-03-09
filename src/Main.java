public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        System.out.println("Salário devido: R$" + folhaPagamento.calcularSalario(5,1, contratoTrabalho));
    }
}
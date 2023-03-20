public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fabio";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 45.00;
        contratoTrabalho.valorHoraExtra = 20.00;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(9, 2, contratoTrabalho);
        holerite.imprimirHolerite();

    }
}
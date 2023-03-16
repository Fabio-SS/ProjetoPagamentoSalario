public class Holerite {

    Funcionario funcionario;
    FolhaPagamento folhaPagamento;
    ContratoTrabalho contratoTrabalho;
    double salarioTotalFuncionario;

    double funcionarioValorTotal(FolhaPagamento folhaPagamento, ContratoTrabalho contratoTrabalho){
        double valorTotalHorasNormais = folhaPagamento.horasNormais * contratoTrabalho.valorHoraNormal;
        double valorTotalHorasExtras = folhaPagamento.horasExtras * contratoTrabalho.valorHoraExtra;
        double valorTotalAdicionalFilho = folhaPagamento.adicionalFilho;
        return salarioTotalFuncionario = valorTotalHorasNormais + valorTotalHorasExtras + valorTotalAdicionalFilho;
    }
}
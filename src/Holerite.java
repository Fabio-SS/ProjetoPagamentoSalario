public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalParaFilhos;
    double salarioTotal;
    //TODO Calcular valor total = somar todos os valores e imprimir saida todos os detalhes no holerite

    double calcularValorTotal(ContratoTrabalho contratoTrabalho){
         salarioTotal = contratoTrabalho.valorHoraNormal + contratoTrabalho.valorHoraExtra;

        return salarioTotal;
    }
}

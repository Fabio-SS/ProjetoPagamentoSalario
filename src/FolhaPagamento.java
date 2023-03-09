public class FolhaPagamento {

    double calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho) {

        double salarioHoraNormal = horaNormal * contratoTrabalho.valorHoraNormal;
        double salarioHoraExtra = horaExtra * contratoTrabalho.valorHoraExtra;
        contratoTrabalho.salarioTotal = salarioHoraNormal + salarioHoraExtra;

        if (contratoTrabalho.funcionario.quantidadeFilhos > 0){
            contratoTrabalho.salarioTotal += (contratoTrabalho.salarioTotal / 100) * 10;
        }

        return contratoTrabalho.salarioTotal;
    }
}
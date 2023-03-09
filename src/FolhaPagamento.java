public class FolhaPagamento {

    double calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho, Holerite holerite) {

        double salarioHoraNormal = horaNormal * contratoTrabalho.valorHoraNormal;
        double salarioHoraExtra = horaExtra * contratoTrabalho.valorHoraExtra;
        holerite.salarioTotal = salarioHoraNormal + salarioHoraExtra;

        if (contratoTrabalho.funcionario.quantidadeFilhos > 0){
            holerite.salarioTotal += (holerite.salarioTotal / 100) * 10;
        }

        return holerite.salarioTotal;
    }
}
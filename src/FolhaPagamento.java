public class FolhaPagamento {

    double calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho) {

        double salarioHoraNormal = horaNormal * contratoTrabalho.valorHoraNormal;
        double salarioHoraExtra = horaExtra * contratoTrabalho.valorHoraExtra;
        return salarioHoraNormal + salarioHoraExtra;
    }
}
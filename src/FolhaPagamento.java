public class FolhaPagamento {

    Holerite calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho){

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valotTotalHorasNormais = horaNormal * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = horaExtra * contratoTrabalho.valorHoraExtra;
        double subTotal = holerite.valotTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contratoTrabalho.adicionalFilho()){
            holerite.adicionalParaFilhos += subTotal * 0.10;
        }

        return holerite;
    }
}
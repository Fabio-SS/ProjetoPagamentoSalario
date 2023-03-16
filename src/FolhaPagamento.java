public class FolhaPagamento {

    ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
    Holerite holerite = new Holerite();

    //HORARIO DO FUNCIONARIO
    int horasNormais = 9;
    int horasExtras = 2;
    double adicionalFilho;

    Holerite calcularSalario(ContratoTrabalho contratoTrabalho, Holerite holerite){
        double valorTotalNormal = horasNormais * contratoTrabalho.valorHoraNormal;
        double valorTotalExtra = horasExtras * contratoTrabalho.valorHoraExtra;
        double valorTotal = valorTotalNormal + valorTotalExtra;

        if (contratoTrabalho.adicionalFilho()){
            adicionalFilho = (valorTotal / 100) * 10;
            valorTotal += adicionalFilho;
        }

        return holerite;
        //return Holerite
    }
}
public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal = 40.0;
    double valorHoraExtra = 20.0;
    double salarioTotal;

    boolean possuiAdicionalParaFilhos(){
        return funcionario.possuiFilhos();
    }
}
public class ContratoTrabalho {

    Funcionario funcionario = new Funcionario();

    double valorHoraNormal = 45.00;
    double valorHoraExtra = 15.00;

    boolean adicionalFilho(){
        return funcionario.funcionarioPossuiFilho();
    }
}
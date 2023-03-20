public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean adicionalFilho(){
        return funcionario.funcionarioPossuiFilho();
    }
}
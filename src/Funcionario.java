public class Funcionario {

    String nome;
    int quantidadeFilhos;

    boolean funcionarioPossuiFilho(){
        return quantidadeFilhos > 0;
    }
}
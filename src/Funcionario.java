public class Funcionario {

    String nome;
    int quantidadeFilhos = 1;

    boolean funcionarioPossuiFilho(){
        return quantidadeFilhos > 0;
    }
}
public class Holerite {

    Funcionario funcionario;

    double valotTotalHorasNormais;
    double valorTotalHorasExtras;
    double adicionalParaFilhos;

    double calcularValorTotal(){
        return valotTotalHorasNormais + valorTotalHorasExtras + adicionalParaFilhos;
    }

    void imprimirHolerite(){

        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: R$ %.2f%n", valotTotalHorasNormais);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filhos: R$ %.2f%n", adicionalParaFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());

    }
}
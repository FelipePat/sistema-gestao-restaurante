public class ControleDeCaixa {

    public static double calcularPrecoVenda(double precoCusto, double margemLucro) {
        return precoCusto + (precoCusto * margemLucro / 100);
    }

    public static double calcularFaturamento(double precoVenda, int quantidadeVendida) {
        return precoVenda * quantidadeVendida;
    }

    public static double calcularCustoTotal(double precoCusto, int quantidadeVendida) {
        return precoCusto * quantidadeVendida;
    }

    public static double calcularLucroLiquido(double faturamento, double custoTotal) {
        return faturamento - custoTotal;
    }
}

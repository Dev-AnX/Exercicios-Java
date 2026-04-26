public class TerminalVendas {
   public static void main(String[] args) {
        String produto1 = "Arroz 5kg";
        String produto2 = "Feijão 2kg";
        String produto3 = "Refrigerante 2lt";
        double precoProduto1 = 15.90D;
        double precoProduto2 = 10.90D;
        double precoProduto3 = 9.90D;
        int quantidadeProduto1 = 3;
        int quantidadeProduto2 = 2;
        int quantidadeProduto3 = 3;
        double desconto = 5.50D;
        double valorBruto = (precoProduto1 * quantidadeProduto1) + (precoProduto2 * quantidadeProduto2) + (precoProduto3 * quantidadeProduto3);
        double valorLiquido = valorBruto - desconto;
        System.out.println("---------- Cupom Fiscal ----------");
        System.out.println(produto1+"...qtd "+quantidadeProduto1+"....... R$"+precoProduto1);
        System.out.println(produto2+"...qtd "+quantidadeProduto2+"....... R$"+precoProduto2);
        System.out.println(produto3+"...qtd "+quantidadeProduto3+"....... R$"+precoProduto3);
        System.out.println("Total sem desconto: "+valorBruto);
        System.out.println("Valor do desconto: "+desconto);
        System.out.println("Total com desconto: "+valorLiquido);    }
}
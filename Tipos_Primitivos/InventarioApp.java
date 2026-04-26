public class InventarioApp {
   public static void main(String[] args) {
        long idLote = 10L;
        char codModelo = 'D';
        int qtdRecebida = 15;
        double preco =  1499.98;
        boolean isTested = true;
        double valorLote = qtdRecebida * preco;
        System.out.println("-------Invetario de Computadores-------");
        System.out.println("Lote: " + idLote);
        System.out.println("Modelo: " + codModelo);
        System.out.println("Quantidade de recebida: " + qtdRecebida);
        System.out.println("Testado: " + isTested);
        System.out.println("Valor total: " + valorLote);
   }
}
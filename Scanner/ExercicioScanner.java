import java.util.Scanner;

public class ExercicioScanner {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é: " + nomeCompleto);
        System.out.println("Digite seu Primeiro Nome: ");
        String primeiroNome = scan.next();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite seu Sexo (M ou F): ");
        char sexo = scan.next().charAt(0);
        System.out.println("Seu nome é: " + primeiroNome + ", sua idade é: " + idade +", sua altura é: " + altura+"m, seu sexo é: " + sexo);
   }
}
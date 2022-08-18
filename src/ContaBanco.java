import java.util.Random;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Olá, seja bem vindo ao Banco DIO, eu vou te acompanhar na criação da sua conta digital: ");
        System.out.println("Por favor digite o seu primeiro nome: ");
        String primeirNome = sc.next();
        System.out.println("Por favor digite o seu último nome: ");
        String ultimoNome = sc.next();
        String nome = primeirNome + " " + ultimoNome;
        int numeroConta = r.nextInt(9999);
        String numeroAgencia = Integer.toString(r.nextInt(999));
        String digitoAgencia = Integer.toString(r.nextInt(9));
        String agencia = numeroAgencia + "-" + digitoAgencia;
        ContaTerminal conta1 = new ContaTerminal(nome, agencia, numeroConta);
        System.out.printf("Bem vindo %s, você deseja fazer um deposíto inicial? ", conta1.getNomeCliente());
        char c = sc.next().charAt(0);
        if (c == 's') {
            System.out.println("Digite o valor que deseja depositar: ");
            double valor = sc.nextDouble();
            conta1.depositar(valor);
        }
        System.out.printf("Nome do cliente: %s%n", conta1.getNomeCliente());
        System.out.printf("Agência do cliente: %s%n", conta1.getAgencia());
        System.out.printf("Número da conta do cliente: %d%n", conta1.getNumeroConta());
        System.out.printf("Saldo inicial da conta é: %.2f", conta1.getSaldo());

        sc.close();
    }
}

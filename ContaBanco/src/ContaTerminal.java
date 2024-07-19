import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Banco! \nCrie sua conta agora!\n");
        System.out.print("Por favor, digite o seu nome completo: ");
        String nome = sc.nextLine().trim();
        System.out.println();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine().trim();
        System.out.println();
        System.out.print("Por favor, digite o número da Conta: ");
        int conta = sc.nextInt();
        System.out.println();
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
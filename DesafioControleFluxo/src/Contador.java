import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int primeroParametro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar (int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

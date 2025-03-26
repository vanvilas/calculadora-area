import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        //cria um objeto scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //exibe o menu de opções
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("Digite sua escolha (1 ou 2): ");

        //lê a escolha do usuário
        int escolha = scanner.nextInt();

        //variável para armazenar a área calculada
        double area = 0;

        //verifica a escolha do usuário e realiza o cálculo apropriado
        switch (escolha) {
            case 1:
                //calcula a área do quadrado
                System.out.println("Digite o comprimento do lado do quadrado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                System.out.println("A área do quadrado é: " + area);
                break;
            case 2:
                //calcula a área do círculo
                System.out.println("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                area = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + area);
                break;
            default:
                //opção inválida
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

        //fecha o scanner
        scanner.close();
    }
}


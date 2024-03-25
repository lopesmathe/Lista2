    import java.util.Scanner;
public class Ex15 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        // Ler o primeiro número e armazená-lo no vetor
        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();

        // Ler os próximos números e verificar se são maiores que o anterior
        for (int i = 1; i < 5; i++) {
            int numero;
            do {
                System.out.print("Digite o próximo número: ");
                numero = scanner.nextInt();
                if (numero <= vetor[i - 1]) {
                    System.out.println("Número inválido. Digite um número maior que o anterior.");
                }
            } while (numero <= vetor[i - 1]);

            vetor[i] = numero;
        }

        // Imprimir o vetor resultante
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

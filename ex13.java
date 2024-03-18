public class ex13 {
    public static void run() {
        int n = 8; // Número de termos desejados
        int[] fibonacci = fibonacciSequence(n);

        // Imprimir o vetor resultante
        System.out.print("Vetor com os " + n + " primeiros termos da sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int[] fibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        
        // Caso especial para os dois primeiros termos
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        // Calcular os próximos termos da sequência de Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        run();
    }
}

public class Ex13 {
    public static void run() {
        int n = 8; 
        int[] fibonacci = fibonacciSequence(n);
        System.out.print("Vetor com os " + n + " primeiros termos da sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
    public static int[] fibonacciSequence(int n) {
        int[] fibonacci = new int[n];        
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        run();
    }
}

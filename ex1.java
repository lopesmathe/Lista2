public class ex1 {
    public static void run() {
        int media = 0;
        wbiblioteca b = new wbiblioteca();
        System.out.println("me diga os 5 valores e depois para ver a media");
        int[] vet = new int[5];

        for (int i = 0; i < 5; i++) {
            b.PegarNumero();
            vet[i] = b.VoltarNumero1();
            media += vet[i];
            
        }
        media /= 5;
        System.out.println("numeros maiores do que a media");
        for (int i = 0; i < 5; i++)
            if (vet[i] > media) {
                System.out.println(vet[i]);
            }

        System.out.println("numeros menores do que a media");
        for (int i = 0; i < 5; i++)
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }

        System.out.println("numeros iguais do que a media");
        for (int i = 0; i < 5; i++)
            if (vet[i] == media) {
                System.out.println(vet[i]);
            }
    }
}

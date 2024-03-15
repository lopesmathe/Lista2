public class ex1 {
    public static void rum() {
        int[] vet = new int[5];
        int i = 0;
        int q = 0;
        int soma = 0;
        System.out.println("me manda 5 numeros");
        wbiblioteca bb = new wbiblioteca();
        for (i = 0; i < 5; i++) {
            bb.PegarNumero();
            vet[i] = bb.VoltarNumero1();
            soma += vet[i];
        }
        System.out.println(soma);
        int media = soma / 5;
        for (q = 0; q < 5; q++) {
            if (media < vet[q]) {
                System.out.printf("os numeros q sao menores do q media é %d\n", vet[q]);
            } else if (media == vet[q]) {
                System.out.printf("os numeros q sao iguais a media é %d\n", vet[q]);
            } else
                System.out.printf("os numeros q sao maiores do q media é %d\n", vet[q]);
        }
    }
}

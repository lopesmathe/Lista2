public class Ex1 {
    public static void run(){
        int media = 0;
        Wbiblioteca b = new Wbiblioteca();
        System.out.println("me");
        int[] vet = new int[5];

        for(int i = 0; i < 5; i++){
            b.PegarNumero();
            vet[i] = b.VoltarNumero1();
            media =+ vet[i];
        }
        System.out.println("numeros maiores do que a media");
        for(int i = 0; i < 5; i++)
        if (vet[i] < media) {
            System.out.println(vet[i]);
        }

        System.out.println("numeros menores do que a media");
        for(int i = 0; i < 5; i++)
        if (vet[i] > media) {
            System.out.println(vet[i]);
        }

        System.out.println("numeros iguais do que a media");
        for(int i = 0; i < 5; i++)
        if (vet[i] == media) {
            System.out.println(vet[i]);
        } 
    }
}

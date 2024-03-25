public class Ex7 {
    public static void run() {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        Wbiblioteca bb = new Wbiblioteca();
        System.out.println("vet 1");
        for (int i = 0; i < 5; i++) {
            bb.PegarNumero();
            vet1[i] = bb.VoltarNumero1();
        }
        System.out.println("vet 1");
        for (int i = 0; i < 5; i++) {
            bb.PegarNumero();
            vet2[i] = bb.VoltarNumero1();
        }
        System.out.println("o resutado é");
        for (int i = 0; i < 5; i++) {
            if (vet1[i] == vet2[i]) {
                System.out.println("true");
            }
        }
    }
}

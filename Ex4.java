public class Ex4 {
    public static void run() {
        int n = 20;
        Wbiblioteca bb = new Wbiblioteca();
        bb.PegarNumero();
        int slot = bb.VoltarNumero1();
        int[] vet = new int[slot];
        for (int i = 0; i < slot; i++) {
            bb.PegarNumero();
            vet[i] = bb.VoltarNumero1();
        }
        for (int i = 0; i < slot; i++) {
            if (vet[i] < n) {
                System.out.println(vet[i]);
            } else
                System.out.println();
        }
    }
}

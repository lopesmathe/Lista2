public class Ex5 {
    public static void run() {
        Wbiblioteca bb = new Wbiblioteca();
        bb.PegarNumero();
        int slot = bb.VoltarNumero1();
        int n = 4;
        int somatoria = 0;
        int[] vet = new int[slot];
        System.out.println("agora me fale quais vao ser os numeros");
        for (int i = 0; i < slot; i++) {
            bb.PegarNumero();
            vet[i] = bb.VoltarNumero1();
        }
        System.out.printf("o numero %d aparece\n", n);
        for (int i = 0; i < slot; i++) {
            if (vet[i] == n) {
                somatoria += 1;
            }
        }
        System.out.println(somatoria);
        System.out.println("vezes");

    }
}

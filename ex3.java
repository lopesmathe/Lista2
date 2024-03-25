public class Ex3 {
    public static void run() {
        System.out.println("Digite quantos numeros vc quer");
        Wbiblioteca bb = new Wbiblioteca();
        bb.PegarNumero();
        int slot = bb.VoltarNumero1();
        int[] vet = new int[slot];
        for (int i = 0; i < slot; i++) {
            bb.PegarNumero();
            vet[i] = bb.VoltarNumero1();
            vet[i] += vet[i];
        }
        boolean desligar = false;
        System.out.println("os numeros sao....");
        for (int i = 0; i < slot; i++) {
            System.out.println(vet[i]);
        }
    }
}

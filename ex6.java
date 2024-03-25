public class Ex6 {
    public static void run() {
        float[] vetNota = new float[5];
        float[] vetPeso = new float[5];
        float somaPonderada = 0;
        float somaPesos = 0;
        System.out.println("Digite as 5 notas e 5 pesos:");
        Wbiblioteca bb = new Wbiblioteca();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ":");
            bb.PegarNumeroF();
            vetNota[i] = bb.VoltarNumero1F();
            System.out.println("Peso " + (i + 1) + ":");
            bb.PegarNumeroF();
            vetPeso[i] = bb.VoltarNumero1F();
            somaPonderada += vetNota[i] * vetPeso[i];
            somaPesos += vetPeso[i];
        }
        float mediaPonderada = somaPonderada / somaPesos;
        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}

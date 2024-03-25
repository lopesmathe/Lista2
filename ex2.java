public class Ex2 {
    public static void run() {
        System.out.println("quantos numeros vc quer ?");
        Wbiblioteca bb = new Wbiblioteca();
        bb.PegarNumero();
        int slote = bb.VoltarNumero1();
        int[] var = new int[slote];
        for (int i = 0; i < slote; i++) {
            bb.PegarNumero();
            var[i] = bb.VoltarNumero1();
        }

        boolean positivosPrinted = false;
        boolean negativosPrinted = false;
        boolean igual0 = false;

        for (int i = 0; i < slote; i++) {
            if (var[i] < 0 && !negativosPrinted) {
                System.out.println("os numeros negativo sao...");
                negativosPrinted = true;
            }
            if (var[i] < 0) {
                System.out.println(var[i]);

            }
        }

        for (int i = 0; i < slote; i++) {
            if (var[i] > 0 && !positivosPrinted) {
                System.out.println("os numeros positivos sao...");
                positivosPrinted = true;
            }
            if (var[i] > 0) {
                System.out.println(var[i]);

            }
        }
        for (int i = 0; i < slote; i++) {
            if (var[i] == 0 && !igual0) {
                System.out.println("os numeros 0 sao...");
                igual0 = true;
            }
            if (var[i] == 0) {
                System.out.println(var[i]);

            }
        }

    }
}
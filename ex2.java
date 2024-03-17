public class ex2 {
    public static void run(){
        System.out.println("quantos numeros vc quer ?");
        wbiblioteca bb = new wbiblioteca();
        bb.PegarNumero();
        int slote = bb.VoltarNumero1();
        int[] var = new int[slote];
        for(int i = 0; i < slote; i++){
            bb.PegarNumero();
            var[i] = bb.VoltarNumero1();
        }

        boolean positivosPrinted = false;
        boolean negativosPrinted = false;
        boolean igual0 = false;

        for(int i = 0; i < slote; i++){
            if (var[i] < 0 && !negativosPrinted) {
                System.out.println(var[i]);
                System.out.println("os numeros negativo sao...");
                negativosPrinted = true;
            }
            else if (var[i] > 0 && !positivosPrinted) {
                System.out.println("os numeros positivos sao...");
                positivosPrinted = true;
                
            }
            if (var[i] == 0 && !igual0){
                System.out.println("os numeros 0 sao...");
                igual0 = true;
            }
            System.out.println(var[i]);

        }

    }
}

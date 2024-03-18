public class ex12 {
    public static void run(){
        int[] vet = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12}; 
        int[] vet2 = new int[vet.length / 2];
        int index = 0;
        for(int i = 0; i < 12; i++){
            if (vet[i] % 2 == 0 && vet[i] != 0 && vet[i] > 0) {
                vet2[index] = vet[i];
                index ++;
                System.out.println(vet2[index - 1]);
            }
            else if (vet[i] % 2 != 1) {
            }
       }
    }
}

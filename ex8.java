public class Ex8 {
 public static void run(){
    int[] A = {1, 2, 3, 4, 5};
    int[] B = {1, 2, 3, 4, 5};
    int[] C = new int[5];
        for(int i = 0; i < 5; i++){
            C[i] = A[i] + B[i];
        }
 
        for(int i = 0; i < 5; i++){
            System.out.println(C[i]);
        }
    }
}

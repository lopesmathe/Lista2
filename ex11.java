public class Ex11 {
    public static void run(){
       int[] A = {0, 2, 4, 6, 8};
       int[] B = {1, 3, 5, 7, 9};
       int C = 0;
           for(int i = A.length - 1; i >= 0; i--){
                C += A[i] * B[i];
           }
           System.out.println("o resutado é"); 
               System.out.println(C);
       }
   }
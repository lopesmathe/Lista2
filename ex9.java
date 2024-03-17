public class ex9 {
    public static void run(){
       int[] A = {1, 2, 3, 4, 5};
       int[] B = {11, 22, 33, 44, 55};
       int[] C = new int[5];
       System.out.println("o resutado é");
           for(int i = 0; i < 5; i++){
               if(A[i] % 2 == 0){
                C[i] = A[i];
               }
               if(B[i] % 2 == 1){
                C[i] = B[i];
               }
           }
           System.out.println("o resutado é"); 
           for(int i = 0; i < 5; i++){
               System.out.println(C[i]);
           }
       }
   }
   
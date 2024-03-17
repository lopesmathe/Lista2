public class ex10 {
    public static void run(){
       int[] A = {1, 2, 3, 4, 5};
       int[] B = new int[5];
       System.out.println("o resutado é");
           for(int i = A.length - 1, j = 0; i >= 0; i--, j++){
               B[j] = A[i];
           }
           System.out.println("o resutado é"); 
           for(int i = 0; i < 5; i++){
               System.out.println(B[i]);
           }
       }
   }
   
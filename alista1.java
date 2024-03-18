import java.util.Scanner;

public class alista1 {
    public static void main(String[] args) {
        Scanner Escolha = new Scanner(System.in);
        System.out.println("escolha qual ex vc vai querer!!!");
        int escolha = Escolha.nextInt();
        switch (escolha) {
            case 1:
                ex1.run();
            case 2:
                ex2.run();
            case 3:
                ex3.run();
            case 4:
                ex4.run();
            case 5:
                ex5.run();
            case 6:
                ex6.run();
            case 7:
                ex7.run();
            case 8:
                ex8.run();
            case 9:
                ex9.run();
            case 10:
                ex10.run();
            case 11:
                ex11.run();
            case 12:
                ex12.run();
                break;
        }
    }
}

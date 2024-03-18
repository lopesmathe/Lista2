import java.util.Scanner;

public class alista1 {
    public static void main(String[] args) {
        Scanner Escolha = new Scanner(System.in);
        System.out.println("escolha qual ex vc vai querer!!!");
        int escolha = Escolha.nextInt();
        switch (escolha) {
            case 1:
                ex1.run();
                break;
            case 2:
                ex2.run();
                break;
            case 3:
                ex3.run();
                break;
            case 4:
                ex4.run();
                break;
            case 5:
                ex5.run();
                break;
            case 6:
                ex6.run();
                break;
            case 7:
                ex7.run();
                break;
            case 8:
                ex8.run();
                break;
            case 9:
                ex9.run();
                break;
            case 10:
                ex10.run();
                break;
            case 11:
                ex11.run();
                break;
            case 12:
                ex12.run();
                break;
            case 13:
                ex13.run();
                break;
        }
    }
}

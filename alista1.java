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
                break;
        }
    }
}

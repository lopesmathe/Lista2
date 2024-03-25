import java.util.Scanner;

public class Wbiblioteca {

    private int num1;
    private int num2;
    private int num3;
    private float num1F;
    private float num2F;
    private float num3F;

    public void PegarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nExtInt();
        System.out.println("Digite o segundo número:");
        num2 = scanner.nExtInt();
    }

    public void PegarNumerosF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1F = scanner.nExtFloat();
        System.out.println("Digite o segundo número:");
        num2F = scanner.nExtFloat();
    }

    public void PegarNumeross() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nExtInt();
        System.out.println("Digite o segundo número:");
        num2 = scanner.nExtInt();
        System.out.println("Digite o terceiro número:");
        num3 = scanner.nExtInt();
    }

    public void PegarNumerossF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1F = scanner.nExtFloat();
        System.out.println("Digite o segundo número:");
        num2F = scanner.nExtFloat();
        System.out.println("Digite o terceiro número:");
        num3F = scanner.nExtFloat();
    }

    public void PegarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        num1 = scanner.nExtInt();
    }

    public void PegarNumeroF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        num1F = scanner.nExtFloat();
    }

    public int VoltarNumero1() {
        return num1;
    }

    public int VoltarNumero2() {
        return num2;
    }

    public int VoltarNumero3() {
        return num3;
    }

    public float VoltarNumero1F() {
        return num1F;
    }

    public float VoltarNumero2F() {
        return num2F;
    }

    public int VoltarNumero3F() {
        return num3;
    }

    public int ContaDeAdição(int a, int b) {
        return a + b;
    }

    public int ContaDeSubtração(int a, int b) {
        return a - b;
    }

    public int ContaDeMultiplicação(int a, int b) {
        return a * b;
    }

    public int ContaDeDivisão(int a, int b) {
        return a / b;
    }
}

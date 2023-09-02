import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.println("El numero es: "+num);

        if (num > 0 && num % 2 != 0) {
            System.out.println("true: numero impar y positivo");
        } else {
            System.out.println("false");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese numA: ");
        int numA = scanner.nextInt();
        
        System.out.print("Ingrese numB: ");
        int numB = scanner.nextInt();
        
        System.out.println("Los numeros ingresados son: "+numA+", "+numB);

        

        if (numA*numB>0) {
            System.out.println("true: Tiene el mismo signo.");
        } else {
            System.out.println("false");
        }
    }
}

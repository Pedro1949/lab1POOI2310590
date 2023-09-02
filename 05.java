import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese un numero [1-7]: ");
        int n = sc.nextInt();

        
        String dia;

        switch (n) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sbado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "numero incorrecto";
                break;
        }

        System.out.println("El dia en letras es: " + dia);

        
    }
}

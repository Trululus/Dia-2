import java.util.Scanner;

public class AnoBisiesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int year = input.nextInt();
        input.close();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }
    }
}
import java.util.Scanner;

public class ClasificadorNumeros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Input
        System.out.println("Ingrese un numero:");
        int number = input.nextInt();
        input.close();
        String isPar;
        String whatIsNumber;
        isPar = (number % 2 == 0) ? "Par" : "Impar";
        whatIsNumber = (number > 0) ? "Positivo" : (number<0) ? "Negativo" : "Es Cero";
        System.out.println("El numero ingresado es "+whatIsNumber+ " y  es "+isPar);
    }
}

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Palabra para usar input

        //Suma
        System.out.println("Ingrese un numero para sumar");
        int a = scanner.nextInt();
        System.out.println("Ingrese otro numero para sumar");
        int b = scanner.nextInt();
        int suma = a+b;
        System.out.println("La suma es "+suma);

        //Resta
        System.out.println("Ingrese un numero para restar");
        int c = scanner.nextInt();
        System.out.println("Ingrese otro numero para restar");
        int d = scanner.nextInt();
        int substract = c - d;
        System.out.println("La resta de los numeros es: "+substract);

        //Multiplicacion
        System.out.println("Ingrese un numero para multiplicar");
        int e = scanner.nextInt();
        System.out.println("Ingrese otro numero para multiplicar");
        int f = scanner.nextInt();
        int product = e * f;
        System.out.println("El resultado de cuya multiplicacion es: "+product);

        //Division
        System.out.println("Ingrese un numero para dividir");
        int g = scanner.nextInt();
        System.out.println("¿Por cuanto deseas dividir?");
        int h = scanner.nextInt();
        scanner.close();
        int division = g / h;
        System.out.println("El resultado de cuya divison es: "+division);
    }
}
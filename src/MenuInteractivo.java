import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora");
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Ingrese un numero para sumar");
                int a = input.nextInt();
                System.out.println("Ingrese otro numero para sumar");
                int b = input.nextInt();
                int suma = a+b;
                System.out.println("La suma es "+suma);
                break;
            case 2:
                System.out.println("Ingrese un numero para restar");
                int c = input.nextInt();
                System.out.println("Ingrese otro numero para restar");
                int d = input.nextInt();
                int substract = c - d;
                System.out.println("La resta de los numeros es: "+substract);
                break;
            case 3:
                System.out.println("Ingrese un numero para multiplicar");
                int e = input.nextInt();
                System.out.println("Ingrese otro numero para multiplicar");
                int f = input.nextInt();
                int product = e * f;
                System.out.println("El resultado de cuya multiplicacion es: "+product);
                break;
            case 4:
                System.out.println("Ingrese un numero para dividir");
                int g = input.nextInt();
                System.out.println("¿Por cuanto deseas dividir?");
                int h = input.nextInt();
                input.close();
                int division = g / h;
                System.out.println("El resultado de cuya divison es: "+division);
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}

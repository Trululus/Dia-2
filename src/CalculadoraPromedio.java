import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Palabra para usar input
        System.out.println("Ingrese la primera nota");
        int a = input.nextInt();
        System.out.println("Ingrese la segunda nota");
        int b = input.nextInt();
        System.out.println("Ingrese la tercera nota");
        int c = input.nextInt();
        input.close();
        float promedio = (a+b+c)/3; //Promedio
        System.out.println("El promedio es: "+promedio);
        if (promedio >= 6){
            System.out.println("¡Felicidades! ¡Aprobaste!");
        }else{
            System.out.println("Lastima! ¡No aprobaste!");
        }     
    }
}
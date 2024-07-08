import java.util.Scanner;

public class OrdenarNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number1 = input.nextInt();
        System.out.println("Ingrese otro numero");
        int number2 = input.nextInt();
        System.out.println("Ingrese un tercer numero");
        int number3 = input.nextInt();
        input.close();
        
        int menor = (number1<number2 && number1<number3) ? number1 : (number2 < number3) ? number2 : number3;
        int mayor  = (number1>number2 && number1>number3) ? number1 : (number2 > number3) ? number2 : number3;
        int medio = (number1 != menor && number1 != mayor) ? number1 : (number2 != menor && number2 != mayor) ? number2 : number3;
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El del medio es: "+medio);
        System.out.println("El numero menor es: "+menor);
    }
}
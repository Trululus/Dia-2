import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Input
        System.out.println("Ingrese su Altura (0.00):");
        float altura = input.nextFloat();
        System.out.println("Ingrese su peso: ");
        int peso = input.nextInt();
        input.close();
        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f%n", imc);
    }
}

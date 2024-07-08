import java.util.Scanner;

public class PropinaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Input
        System.out.println("Ingresa el total de la cuenta:");
        int total = input.nextInt();
        System.out.println("Ingresa el porcentaje de propina:");
        int percent = input.nextInt();
        input.close();
        float totalPropina = total * (percent / 100.0f);
        System.out.println("El total de la propina es: " + totalPropina);
    }
}

import java.util.Scanner;

public class Taximetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la distancia en metros: ");
        int distancie = input.nextInt();
        input.close();
        float tarifa = distancie * 0.5f;
        System.out.println("La tarifa es de "+tarifa +" pesos");
    }
}

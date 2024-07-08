import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la distancia en kl (0.000):");
        float km = input.nextFloat();
        input.close();
        float millas = (km * 0.621371f);
        System.out.println("La distancia en millas es: "+millas);
    }
}

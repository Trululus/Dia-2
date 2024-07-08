import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que Quieres convertir?");
        System.out.println("1.Celsius a Fahrenheit");
        System.out.println("2.Fahrenheit a Celsius");
        String type = input.nextLine();
        switch (type) {
            case "1":
                System.out.println("Ingrese la temperatura en Celsius: ");
                float celsius = input.nextFloat();
                float fahrenheit = (celsius * 9f / 5f) + 32;
                System.out.println("La temperatura en Fahrenheit es "+fahrenheit);
                break;
            case "2":
                System.out.println("Ingrese la temperatura en Fahrenheit: ");
                float fahrenheitToCelsius = input.nextFloat();
                input.close();
                System.out.println("La temperatura en Celsius es "+(fahrenheitToCelsius - 32)*5f/9f);
                break;
            default:
                System.out.println("Ingresa un tipo valido");
                break;
        }
    }
}

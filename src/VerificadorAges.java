import java.util.Scanner;

public class VerificadorAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Palabra para usar input

        System.out.println("Ingresa tu edad");
        int age = scanner.nextInt();
        scanner.close();
        if(age > 17){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
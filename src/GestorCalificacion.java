import java.util.Scanner;

public class GestorCalificacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion (1-100): ");
        int calificacion = input.nextInt();
        input.close();
        if (calificacion>=90 && calificacion<=100){
            System.out.println("Aprobaste con una Superior");
        }else if (calificacion>=80 && calificacion<=89){
            System.out.println("Aprobaste con un Alto");
        }else if (calificacion>=70 && calificacion<=79){
            System.out.println("Aprobaste con un Medio");
        }else if (calificacion>=60 && calificacion<=69){
            System.out.println("Aprobaste con un Basico");
        }else if (calificacion>=50 && calificacion<=59){
            System.out.println("Reprobaste con un bajo");
        }else if (calificacion>=40 && calificacion<=49){
            System.out.println("No presente calificaion (N/N)");
        }
    }
}


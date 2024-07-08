import java.util.Scanner;

public class GenHoroscopo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un mes (1-12): ");
        int month = input.nextInt();
        System.out.println("Ingrese un dia (1-31): ");
        int day = input.nextInt();
        input.close();

        switch (month) {
            case 1: 
                if(day<=19){
                    System.out.println("Eres capricornio");
                }else if(day>=20 && day<=31){
                    System.out.println("Eres Acuario");
                }
                    break;
            case 2: 
                if(day<=18){
                    System.out.println("Eres Acuario");
                }else if(day>=19 && day<=28){
                    System.out.println("Eres Piscis");
                }else{
                    System.out.println("Ingresa un dia valido");
                    }
                    break;
            case 3: 
                if(day<=20){
                    System.out.println("Eres Piscis");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Aries");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 4: 
                if(day<=19){
                    System.out.println("Eres Aries");
                }else if(day>=20 && day<=30){
                    System.out.println("Eres Tauro");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 5: 
                if(day<=20){
                    System.out.println("Eres Tauro");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Geminis");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 6:
                if(day<=20){
                    System.out.println("Eres Geminis");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Cancer");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 7:
                if(day<=20){
                    System.out.println("Eres Cancer");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Leo");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 8:
                if(day<=20){
                    System.out.println("Eres Leo");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Virgo");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;   
            case 9:
                if(day<=20){
                    System.out.println("Eres Virgo");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Libra");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 10:
                if(day<=20){
                    System.out.println("Eres Libra");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Scorpio");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 11:
                if(day<=20){
                    System.out.println("Eres Scorpio");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Sagitario");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            case 12:
                if(day<=20){
                    System.out.println("Eres Sagitario");
                }else if(day>=21 && day<=31){
                    System.out.println("Eres Capricornio");
                }else{
                    System.out.println("Ingresa un dia valido");
                }
                    break;
            default:
                System.out.println("Ingresa un mes valido");
                break;
        }   
    }
    
}

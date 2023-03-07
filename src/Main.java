import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int month,day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter what month you were born : ");
        month = scanner.nextInt();
        System.out.println("(* | *)");
        System.out.print("Enter the number of day you were born : ");
        day = scanner.nextInt();
        System.out.println("(* | *)");
        scanner.close();
        String zodiacSign;
        switch(month){
            case 1:
                if(day <= 21){
                  zodiacSign = "Capricorn";
                    System.out.println( "Your zodiac sign is : " + zodiacSign);
                }else if(day >= 22 && day <= 31){
                    zodiacSign = "Aquarius";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 2:
                if(day <= 19){
                    zodiacSign = "Aquarius";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 20 && day <= 28){
                    zodiacSign = "Pisces";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 28 !");
                }
                break;
            case 3:
                if(day <= 20){
                    zodiacSign = "Pisces";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 21 && day <= 31){
                    zodiacSign = "Aries";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 4:
                if(day <= 20){
                    zodiacSign = "Aries";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 21 && day <= 30){
                    zodiacSign = "Taurus";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 30 !");
                }
                break;
            case 5:
                if(day <= 21){
                    zodiacSign = "Taurus";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 22 && day <= 31){
                    zodiacSign = "Gemini";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 6:
                if(day <= 22){
                    zodiacSign = "Gemini";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 23 && day <= 30 ){
                    zodiacSign = "Cancer";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 30 !");
                }
                break;
            case 7:
                if(day <= 22){
                    zodiacSign = "Cancer";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 23 && day <= 31){
                    zodiacSign = "Leo";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 8:
                if(day <= 22){
                    zodiacSign = "Leo";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 23 && day <= 31){
                    zodiacSign = "Virgo";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 9:
                if(day <= 22){
                    zodiacSign = "Virgo";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 23 && day <= 30){
                    zodiacSign = "Libra";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 30 !");
                }
                break;
            case 10:
                if(day <= 22){
                    zodiacSign = "Libra";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 23 && day <= 31){
                    zodiacSign = "Scorpio";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 11:
                if(day <= 21){
                    zodiacSign = "Scorpio";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 22 && day <= 30){
                    zodiacSign = "Sagittarius";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            case 12:
                if(day <= 21){
                    zodiacSign = "Sagittarius";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else if(day >= 22 && day <= 31){
                    zodiacSign = "Capricorn";
                    System.out.println("Your zodiac sign is : " + zodiacSign);
                }else{
                    System.out.println("Please enter the day starting from 1 ending to 31 !");
                }
                break;
            default:
        }
    }
}
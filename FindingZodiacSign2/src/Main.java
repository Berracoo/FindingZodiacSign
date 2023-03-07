import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String birthMonth;
        String zodiacSign = "";
        String todayDate = DateFormat.getDateInstance().format(new Date());
        // with DateFormat.getDateInstance().format(new Date()); you can get today's date.
        int dayOfBirth;
        boolean validDate = true;
        // getting input from user
        Scanner input = new Scanner(System.in);
        System.out.println("What date were you born?");
        System.out.println("Example: October 30");
        // lowering the characters of the month
        birthMonth = input.next().toLowerCase();
        dayOfBirth = input.nextInt();

        // putting all the horoscopes to a list.
        LinkedList<String> horoscope = new LinkedList<String>();
        horoscope.add("You will find true love soon.");
        horoscope.offer("You will rekindle an old relationship.");
        horoscope.addFirst("Your fortunes will soon change for the better.");
        horoscope.add("You will avoid a disastrous outcome.");
        horoscope.offer("You will join a country club.");
        horoscope.add(3,"A blessing will find its way to you.");
        horoscope.add("You will get a new car.");
        horoscope.addLast("You are an awesome person and will find happiness in all that you do.");
        horoscope.add("Your life will be like Ooh Aah-hh");
        horoscope.addFirst("You will be showered with blessings");
        horoscope.add(4,"The attractive opposite sex will find you more appealing");
        horoscope.offer("You will slip and fall, but learn a great lesson from it.");

        // getting the lists size.
        int len = horoscope.size();
        // generating the random class.
        Random randomGenerator = new Random();
        // specifying that list size will be our randomGenerators limits.
        int randomHor = randomGenerator.nextInt(len);
        //picking a random horoscope.
        String lastHoroscope = horoscope.get(randomHor);

         // The compareToIgnoreCase method is used for comparing birthMonth and the input while ignoring their case size
        // if they are equal to each other the method will turn 0
        // equals to is used for if birth month equals the input returns true or false.
         if((birthMonth.compareToIgnoreCase("march") == 0)&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("april") == 0)&&(dayOfBirth<=20)){
            zodiacSign = "Aries";


        }else if((birthMonth.equals("april"))&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("may") == 0)&&(dayOfBirth<=21)){
            zodiacSign = "Taurus";


        }else if((birthMonth.equals("may"))&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("june") == 0)&&(dayOfBirth<=21)){
            zodiacSign = "Gemini";


        }else if((birthMonth.compareToIgnoreCase("june") == 0)&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("july") == 0)&&(dayOfBirth<=22)){
            zodiacSign = "Cancer";


        }else if((birthMonth == "july")&&(dayOfBirth>=23)||(birthMonth.compareToIgnoreCase("august") == 0)&&(dayOfBirth<=23)){
            zodiacSign = "Leo";


        }else if((birthMonth.compareToIgnoreCase("august") == 0)&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("september") == 0)&&(dayOfBirth<=23)){
            zodiacSign = "Virgo";


        }else if((birthMonth == "september")&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("october") == 0)&&(dayOfBirth<=23)){
            zodiacSign = "Libra";


        }else if((birthMonth.compareToIgnoreCase("october") == 0)&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("november") == 0)&&(dayOfBirth<=22)){
            zodiacSign = "Scorpio";


        }else if((birthMonth.compareToIgnoreCase("november") == 0)&&(dayOfBirth>=23)||(birthMonth.compareToIgnoreCase("december") == 0)&&(dayOfBirth<=21)){
            zodiacSign = "Sagittarius";


        }else if((birthMonth.compareToIgnoreCase("december") == 0)&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("january") == 0)&&(dayOfBirth<=20)){
            zodiacSign = "Capricorn";


        }else if((birthMonth.compareToIgnoreCase("january") == 0)&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("fenruary") == 0)&&(dayOfBirth<=18)){
            zodiacSign = "Aquarius";


        }else if((birthMonth.compareToIgnoreCase("february") == 0)&&(dayOfBirth>=19)||(birthMonth.compareToIgnoreCase("march") == 0)&&(dayOfBirth<=20)){
            zodiacSign = "Pisces";


        }else{
            System.out.println(birthMonth+" "+dayOfBirth+" does not seem be a valid date");
            validDate = false;
        }

        if(validDate == true){
            System.out.println("You are a/an "+ zodiacSign);
            System.out.println("Your horoscope for "+ todayDate + " is: ");
            System.out.println(lastHoroscope);
        }
    }


}

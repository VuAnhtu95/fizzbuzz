public class FizzBuzzTranslate {
    public static String traslate(int number){
        boolean checkNumber = number > 0 ;
        if (checkNumber) return chiaHet3and5(number);
        else return "Không phải số lớn hơn 0";
    }
    public static String chiaHet3(int number){
        boolean checkChia = number % 3 == 0 ;
        if (checkChia) return "Fizz";
        else return chiaHet5(number);
    }
    public static String chiaHet5(int number){
        boolean checkChia = number % 5 == 0 ;
        if (checkChia) return "Buzz";
        else return "number = " + number;
    }
    public static String chiaHet3and5(int number){
        boolean checkChia3 = number % 3 == 0 ;
        boolean checkChia5 = number % 5 == 0 ;
        if (checkChia3 && checkChia5) return "FizzBuzz";
        else return chiaHet3(number);
    }
}

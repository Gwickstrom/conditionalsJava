import java.lang.System;
public class FizzBuzz {
    public String fizzBuzz(int number) {
       // fizzbuzz logic here
       int fiz = number % 3;
       int buz = number % 5;
       int fizbuz;
       if(fiz == 0){
           System.out.println("Fizz");
       }
       if(buz == 0){
           System.out.println("Buzz");
       }
       if(fiz == 0 && buz == 0){
           System.out.println("FizzBuzz");
       }
       else{
           System.out.println("The number is: " + number);
       }
       String number2 = String.valueOf(number);
       return number2;
    }
}

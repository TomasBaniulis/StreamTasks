package lt.code.academy;

import lt.code.academy.fizzBuzz.Main;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class digitManipulation {

    public static void main(String[] args) {

        String numbers = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17";

        digitManipulation main = new digitManipulation();

        String x = main.getNewString(numbers);

        System.out.println(x);


    }

    String getNewString (String text){

       String x = Stream.of(text)
               .filter(n -> !n.equals(","))
               .map(n -> Integer.parseInt(n)*2)
               .filter(n -> n%4 !=0)
               .map(n -> String.valueOf(n))
               .collect(Collectors.joining(":"));

       return x;
    }
}

package lt.code.academy.fizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int number = 30;

        Main main = new Main();

        String x = main.returnFizzBuzz(number);

        System.out.println(x);



    }

    String returnFizzBuzz (Integer number){

        List<Integer> numbers = new ArrayList<>();
        int counter = 1;

        for (int i =0; i< number; i++){
            numbers.add(counter);
            counter ++;
        }

        String fizzBuzz = numbers.stream()
                .map(n -> n%3 == 0 && n%5 == 0 ? n.toString().replace(n.toString(),"Fizzbuzz") :
                        n%3 == 0 ? n.toString().replace(n.toString(), "Fizz"):
                                n%5==0 ? n.toString().replace(n.toString(), "Buzz") : n )
                .collect(Collectors.toList()).toString();

        return  fizzBuzz;

    }




}

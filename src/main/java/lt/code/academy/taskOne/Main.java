package lt.code.academy.taskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);

        String text = main.getString(numbers);

        System.out.println(text);

    }




    String getString (List<Integer> numbers){
        String text = numbers.stream().map(n -> n%2 ==0 ? String.valueOf(n)+"e" : String.valueOf(n)+"o").collect(Collectors.joining(","));

        return text;

    }

}

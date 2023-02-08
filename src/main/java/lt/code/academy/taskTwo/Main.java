package lt.code.academy.taskTwo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        String textOne = "Valio";
        String textTwo = "Alio";

       String Word =  main.returnGoodWord(textOne, textTwo, main.biPredicate);

        System.out.println(Word);


    }

    String returnGoodWord (String wOne, String wTwo, BiPredicate biPredicate){

        Boolean x = biPredicate.test(wOne, wTwo);

       if (x == true){
           return wOne;
       }

        return  wTwo;

    }

    BiPredicate <String, String> biPredicate = (w1, w2) -> w1.length() >= w2.length();

}

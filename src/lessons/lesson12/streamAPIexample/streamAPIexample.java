package lessons.lesson12.streamAPIexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamAPIexample
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("abcdw");
        list.add("abc.2");
        list.add("abcffff");
        list.add("abcrdse");
        list.add("a");

        /*Optional<String> any = list.stream().findAny();
        if(any.isPresent())
        {
            String s = any.get();
            System.out.println("object:" + s);
        }
        else
        {
           System.err.println("empty object");
        }*/


        /*list.stream().filter(new Predicate()
        {
            @Override
            public boolean test(Object o)
            {
                return false;
            }
       });*/

        List<String> collect = list.stream()
                .filter(s -> s.length() <= 5)
                //.map(String: :toUpperCase())
                .map(s -> s.toUpperCase())
                //.sorted((s1, s2) -> s1.compareTo(s2));
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(collect);



    }

}








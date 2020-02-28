package heinzawaung;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       List<Integer> number = new LinkedList<>();
       number.add(20);
       number.add(12);
       number.add(44);
       number.add(89);
       number.add(76);
       number.add(100);
       number.add(10);

       Comparator<Integer> integerComparator = new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               // 30 - 20
               if (o1 > o2){
                   return -1;
               }
               return 1;
           }
       };

       Collections.sort(number,integerComparator);
        System.out.println("This is after sorting.");
        for (Integer test : number){
            System.out.println("This is " + test);
        }

        //This is String Comparator..

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cucumber");
        fruits.add("Orange");
        fruits.add("Grape");

        // Reverse Comparator with anonymous class
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2) ;
            }
        };

        Collections.sort(fruits,stringComparator);
        System.out.println("After sorting..");
        for (String fru : fruits){
            System.out.println("This is " + fru);
        }

    }
}


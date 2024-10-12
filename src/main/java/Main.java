import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
         array.add((int)(Math.random() * 1000));
        }

        List<Integer> newArr = myFilter(array, (n) -> n % 2 == 0);

        System.out.println(newArr);

    }

    private static List<Integer> myFilter(List<Integer> src, MyPredicate predicate){
        List<Integer> result = new ArrayList<>();
        for (Integer num : src) {
            if (predicate.test(num)) {
                result.add(num);
            }
        }
        return result;

    }

}
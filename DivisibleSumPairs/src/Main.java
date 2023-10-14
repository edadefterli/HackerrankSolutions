import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        System.out.println("Result: " + Result.divisibleSumPairs(n,k,arr));

    }
}

//ar = [1, 3, 2, 6, 1, 2]
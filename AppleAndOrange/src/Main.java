import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int s = 7;
        int t = 10;
        int b = 12;
        List<Integer> apples = Arrays.asList(2, 3,-4);
        List<Integer> oranges = Arrays.asList(3,-2,-4);

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
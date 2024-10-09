import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> s = List.of(2, 2, 1, 3, 2); // Chocolate pieces
        int d = 4; // Birthday
        int m = 2; // Month

        int result = Result.birthday(s, d, m);
        System.out.println(result); // Output: 2
    }
}
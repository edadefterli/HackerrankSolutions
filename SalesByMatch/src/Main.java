import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);

        System.out.println("Pair of Socks: "+ Result.sockMerchant(list.size(),list));

    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> bill = new ArrayList<>();

        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        Result.bonAppetit(bill,1,12);

    }
}
import java.util.ArrayList;
import java.util.List;

public class Result {

    public static int findDigits(int n) {
        int temp = n;
        int numberOfDivider=0;
        List<Integer> digits = new ArrayList<>();

        if(n < 10){
            return 0;
        }

        while (temp>0){
            digits.add(temp % 10);
            temp = temp / 10;
        }

        for (int digit:digits) {
            if((digit != 0) && (n % digit == 0)){
                numberOfDivider+=1;
            }
        }

        return numberOfDivider;

    }

}

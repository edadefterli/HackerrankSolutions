import java.util.Collections;
import java.util.List;

public class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int maxAList = Collections.max(a);
        int minBList = Collections.min(b);

        for (int i = maxAList; i <= minBList; i += maxAList) {
            boolean isValid = true;

            for (int numA : a) {
                if (i % numA != 0) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (int numB : b) {
                    if (numB % i != 0) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;

    }
}

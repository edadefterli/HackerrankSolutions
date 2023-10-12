import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minValue = scores.get(0);
        int maxValue = scores.get(0);
        int min = 0;
        int max = 0;

        for(int i=0; i<scores.size(); i++){
            if(scores.get(i) < minValue){
                minValue = scores.get(i);
                min += 1;
            } else if (scores.get(i) > maxValue) {
                maxValue = scores.get(i);
                max += 1;
            }
        }

        List<Integer> values = new ArrayList<>();
        values.add(max);
        values.add(min);

        return values;
    }
}

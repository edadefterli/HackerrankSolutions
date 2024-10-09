import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static int migratoryBirds(List<Integer> arr) {
        int maxCount = 0;
        int birdTypeId = Integer.MAX_VALUE;

        Map<Integer, Integer> birdCount = new HashMap<>();

        for (int bird : arr) {
            birdCount.put(bird, birdCount.getOrDefault(bird, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : birdCount.entrySet()) {
            int birdId = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && birdId < birdTypeId)) {
                maxCount = count;
                birdTypeId = birdId;
            }
        }

        return birdTypeId;

    }
}
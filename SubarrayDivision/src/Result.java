import java.util.List;

// int s[n]: the numbers on each of the squares of chocolate
// int d: Ron's birth day (sum)
// int m: Ron's birth month (length)
public class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        int subarrayCount = 0;
        for(int i=0; i <= s.size()-m; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += s.get(i + j);
            }
            if(sum == d){
                subarrayCount++;
            }
        }

        return subarrayCount;
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Result {

    public static int sockMerchant(int n, List<Integer> ar){

        int sockMerchant = 0;

        for(int i = 0; i < n; i++){
            int freq = 0;
            if(ar.get(i)!= -1){
                freq = Collections.frequency(ar,ar.get(i));
                Collections.replaceAll(ar, ar.get(i), -1);
                sockMerchant += (freq/2);
            }
        }
        return sockMerchant;
    }

}

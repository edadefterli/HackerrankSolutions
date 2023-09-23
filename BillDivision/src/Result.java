import java.util.List;

public class Result {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int actual = 0;

        for(int i = 0; i<bill.size();i++){
            if(i == k){
                continue;
            }
            else{
                actual += bill.get(i);
            }
        }

        actual /= 2;

        if (actual==b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-actual);
        }

    }

}

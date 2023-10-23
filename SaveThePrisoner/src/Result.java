public class Result {

    public static int saveThePrisoner(int n, int m,int s){
        // n: the number of prisoners
        // m: the number of sweets
        // s: the chair number to begin passing out sweets from

        int totalS = (s + m)-1;

        int prisonerIndex = (totalS%n) ;

        if(prisonerIndex == 0){
            prisonerIndex = n;
        }

        return prisonerIndex;

    }
}

import java.util.List;

public class Result {

    //s: integer, starting point of Sam's house location.
    //t: integer, ending location of Sam's house location.
    //a: integer, location of the Apple tree.
    //b: integer, location of the Orange tree.
    //apples: integer array, distances at which each apple falls from the tree.
    //oranges: integer array, distances at which each orange falls from the tree.

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (int apple: apples) {
            if(a+apple >= s && a+apple<=t){
                numberOfApples++;
            }
        }
        for (int orange: oranges) {
            if(b+orange >= s && b+orange<=t){
                numberOfOranges++;
            }
        }

        //Output format required by hackerrank
        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);
    }


}

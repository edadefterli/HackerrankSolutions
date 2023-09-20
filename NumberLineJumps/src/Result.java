public class Result {


    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // x1+(v1 * jump ) = x2+(v2*jump)
        // jump = (x2-x1) / (v2-v1)
        // jump can only be a in integer.

        double t = (double)(x2 - x1)/(v1 - v2);
        if (t >= 0 && (int)t == t)
            return "YES";
        return "NO";


    }

}

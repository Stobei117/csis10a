/**
 * Created by david on 4/15/14.
 */
public class VectorNorm {

    public static void main(String[] args) {
    System.out.println(norm(2.0, 3.0, 4.0));
    }
    public static double norm(double x, double y, double z) {
       double vector;
        vector= Math.sqrt((Math.pow(x,2))+(Math.pow(y,2))+ (Math.pow(z,2)));
        return vector;

    }
















}

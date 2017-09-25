import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MagicHappensHere {
    public static int n;
    public static double x;
    public static ArrayList<Double> points = new ArrayList<>();



    public static void main(String[] args) {
        double lag;
        double newt;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of points = ");

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (Exception ignore){}

        System.out.print("Enter x = ");
        try {
            x = Double.parseDouble(reader.readLine());
        } catch (Exception ignore){}


        System.out.println("Enter points: ");
        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(++k + ") ");
            try {
                points.add(Double.parseDouble(reader.readLine()));
            } catch (Exception ex){
                System.out.println("Invalid input!");
                break;
            }
        }
        System.out.println();

        Lagrange lagrange = new Lagrange(x, n, points);
        lag = lagrange.go();
        System.out.println("\nLagrange: " + lag);

        Newton newton = new Newton(x, n, points);
        newt = newton.go();
        System.out.println("\nNewton: " + newt + '\n');

        System.out.println("f(x) = " + 7 * Math.exp(7*x * x + 1));


    }//close main
}

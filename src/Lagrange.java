import java.util.ArrayList;

public class Lagrange {
    private double x;
    private int n;
    private ArrayList<Double>X = new ArrayList<>();

    public Lagrange(double x, int n, ArrayList<Double> x1) {
        this.x = x;
        this.n = n;
        X = x1;
    }

    public double go() {

        ArrayList<Double>Y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Y.add(7*Math.exp(7*x * x + 1));
        }


        double s = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            double d1 = 1, d2 = 1;
            for (int j = 0; j < n; j++) {
                if (i != j){
                    d1 *= (x - X.get(j));
                    d2 *= (X.get(i) - X.get(j));
                }
            }//close forj

            s += d1/d2 * Y.get(i);
            System.out.print("L"+ ++k + " = " + s + " ");
        }

        return s;
    }//close go

}//close class

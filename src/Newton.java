import java.util.ArrayList;


public class Newton {
    private double x;
    private int n;
    private ArrayList<Double> X = new ArrayList<>();

    public Newton(double x, int n, ArrayList<Double> x1) {
        this.x = x;
        this.n = n;
        X = x1;
    }

    public double go(){
        double s = 0, k = 1;
        double[][] rizn = new double[n][n];

        ArrayList<Double>Y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Y.add(7*Math.exp(7 * x * x + 1));
        }

        for (int j = 1; j < n-1; j++) {
            for (int i = 1; i < n-j; i++) {
                if (j == 1) {
                    rizn[i][j] = (Y.get(i) - Y.get(i - 1)) / (X.get(i) - X.get(i - 1));
                } else {
                    rizn[i][j] = (rizn[i+1][j-1] - rizn[i][j-1]) / (X.get(i + j - 1) - X.get(i -1));
                }

            }

        }//close loop

        int d = 1;
        s=Y.get(0);

        for (int i = 1; i < n - 1; i++) {
            d *= x - X.get(i-1);
            s += rizn[1][i] * d;
        }
        
        return s;
    }
}

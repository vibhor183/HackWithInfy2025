package GreedyApproach;

import java.util.*;

public class Fractional_knapsack_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int cap = sc.nextInt(); 
        int[][] a = new int[n][2];  

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); 
            a[i][1] = sc.nextInt();  
        }

        Arrays.sort(a, (x, y) -> {
            double r1 = (double) x[0] / x[1];
            double r2 = (double) y[0] / y[1];
            return Double.compare(r2, r1);
        });

        double val = 0;

        for (int[] it : a) {
            if (cap >= it[1]) {
                val += it[0];
                cap -= it[1];
            } else {
                val += it[0] * ((double) cap / it[1]);
                break;
            }
        }

          System.out.printf(" %.2f\n",val);
    }

}

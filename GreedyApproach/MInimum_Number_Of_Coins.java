package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class MInimum_Number_Of_Coins {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();

        Arrays.sort(c);
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (amt >= c[i]) {
                amt -= c[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
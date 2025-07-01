package GreedyApproach;

import java.util.*;

class A {
    int s, e;
    A(int s, int e) {
        this.s = s;
        this.e = e;
    }
}

public class Activity_Selection_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A[] a = new A[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            a[i] = new A(s, e);
        }
        Arrays.sort(a, Comparator.comparingInt(x -> x.e));
        int c = 1, last = a[0].e;
        for (int i = 1; i < n; i++) {
            if (a[i].s >= last) {
                c++;
                last = a[i].e;
            }
        }
        System.out.println(c);
    }
}

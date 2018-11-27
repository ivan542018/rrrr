import java.util.Scanner;

public class Main {
    public static int sum(int d, int[] a){
        int x = 0;
        int g = 0;
        int t = a[0];
        for(int y = 0; y < d; y++) {
            if(a[y] < t) {
                x = y;
                t = a[y];
            }
        }
        g = a[x];
        for(int b = 0; b < x; b++) {
            a[b] = g;
            g = a[b + 1];
        }
        for(int u = 0; u < d; u++) {
            System.out.print(a[u] + " ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++) {
            int d = in.nextInt();
            a[i] = d;
        }
        sum(n, a);
    }
}
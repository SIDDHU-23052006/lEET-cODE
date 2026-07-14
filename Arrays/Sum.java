package Arrays;

import java.util.*; 

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum =0;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                arr[i][j] = sc.nextInt();
                sum+=arr[i][j];
            }
        }
        int sumc = 0;
        int sumr = 0;
        for(int i = 0;i<n;i++)  {
            for(int j = 0;j<n;j++) {
                sumr+=arr[i][j];
            }
        }
    }    
}

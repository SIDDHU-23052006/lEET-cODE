import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++) {
            if(i%2==1) {
                int p = i;
                while(p > 0) {
                    System.out.print(p+" ");
                    p--;
                }
            }
            else {
                int p = 1;
                while(p <= i) {
                    System.out.print(p+" ");
                    p++;
                }
            }
            System.out.println();
        }
    }
}

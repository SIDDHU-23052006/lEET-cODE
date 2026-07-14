import java.util.*;

public class Gmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int mid = 0;
        while(s.length() > mid && s.charAt(mid)!='@') {
            mid++;
        }
        if(mid == s.length()) {
            System.out.println("Invalid");
            return;
        }
        boolean flag = true;
        for(int i = 0;i<mid-1;i++) {
            if(!(s.charAt(i) >= 96 && s.charAt(i) <=122)) {
                flag = false;
                break;
            }
        }
        if(!flag) {
            System.out.println("Invalid");
            return;
        }
        int j = 0;
        String check = new String(s.substring(mid));
        if(check.equals("@gmail.com")) {
            System.out.println("Valid");
            return;
        }
        System.out.println("Invalid");
    }
}

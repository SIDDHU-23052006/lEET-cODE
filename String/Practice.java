import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = " 8";
        // int n = 4;
        // System.out.println(s.charAt(0) == ' ');
        int n = 1;
        String s = "is2 sentence4 This1 a3";
        String res = new String();
        boolean flag = false;
        boolean f = true;
        while(f) {
            String temp = new String();
            for(int i = 0;i<s.length();i++) {
                if((s.charAt(i)+"").equals(n+"")) {
                    for(int j = i;j>=0 &&s.charAt(j)!=' ';j--) {
                        temp = s.substring(j,i);
                        flag = true;
                    }
                }
                if(flag) {
                    flag = false;
                    res = res+temp+" ";
                    n++;
                }
            }
        }
        System.out.println(res);
    }
}
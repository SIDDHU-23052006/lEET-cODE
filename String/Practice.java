import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // String s = " 8";
        // // int n = 4;
        // // System.out.println(s.charAt(0) == ' ');
        // int n = 1;
        // String s = "is2 sentence4 This1 a3";
        // String res = new String();
        // boolean flag = false;
        // boolean f = true;
        // while(f) {
        //     String temp = new String();
        //     for(int i = 0;i<s.length();i++) {
        //         if((s.charAt(i)+"").equals(n+"")) {
        //             for(int j = i;j>=0 &&s.charAt(j)!=' ';j--) {
        //                 temp = s.substring(j,i);
        //                 flag = true;
        //             }
        //         }
        //         if(flag) {
        //             flag = false;
        //             res = res+temp+" ";
        //             n++;
        //         }
        //     }
        // }
        // System.out.println(res);
        // int n = 48 ;
        // System.out.println((char)n);
        // int num = Integer.parseInt("11")+96;
        // char c = (char)num;
        // String r = new String();
        // r = r+"1"+"2";
        // System.out.println(r);
        // System.out.println((int)' ');
        // String s = "";
        // // int n = Integer.parseInt(s);
        // System.out.println(s);
        // String s = new String("");
        // System.out.println(s.length());

        // String allowed = "ab";
        // String[] words = {"ad","bd","aaab","baa","badab"};

        // int count = 0;
        // for(String str : words) {
        //     boolean flag = true;
        //     int i = 0;
        //     while(i!=str.length()){
        //         if((allowed.contains(str.charAt(i)+"")) && str.length() < allowed.length()) {
        //             str = str.replaceAll(str.charAt(i)+"","");
        //             i = 0;
        //         }
        //         System.out.println(str);
        //         flag = false;
        //         break;
        //     }
        //     System.out.print(flag+" ");
        //     if(flag && str.length() == 0) {
        //         System.out.print(flag);
        //         count++;
        //     }
        //     System.out.println();
        // }
        // System.out.println(count);
        // String s = "a1";
        // int i = s.charAt(1)-'0';
        // int j = s.charAt(0) - 96;
        // System.out.println(i+" "+j);
        int length = 2909;int width = 3968;int height = 3272; int mass = 727;
        long volume = (long)length*width*height*1L;
        System.out.println(volume);
        System.out.println(37768408064L);
        boolean flagBulky = false;
        boolean flagMass = false;
        System.out.println(1000000000);
        if(length >= 10000|| height >= 10000 || width >= 10000 || mass >= 10000 || volume >= 1000000000L) {
            flagBulky = true;
        }
        if(mass >= 100) {
            flagMass = true;
        }
        System.out.println(flagBulky+" "+flagMass);
        if(flagBulky && flagMass) {
            System.out.println("both");
        }
        else if(!flagBulky && !flagMass) {
            System.out.println("Neither");
        }
        else if(flagBulky && !flagMass) {
            System.out.println("Bulky");
        }
        else if(!flagBulky && flagMass) {
            System.out.println("Heavy");
        }
    }
}
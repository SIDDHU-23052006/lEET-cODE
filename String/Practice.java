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
        // int length = 2909;int width = 3968;int height = 3272; int mass = 727;
        // long volume = (long)length*width*height*1L;
        // System.out.println(volume);
        // System.out.println(37768408064L);
        // boolean flagBulky = false;
        // boolean flagMass = false;
        // System.out.println(1000000000);
        // if(length >= 10000|| height >= 10000 || width >= 10000 || mass >= 10000 || volume >= 1000000000L) {
        //     flagBulky = true;
        // }
        // if(mass >= 100) {
        //     flagMass = true;
        // }
        // System.out.println(flagBulky+" "+flagMass);
        // if(flagBulky && flagMass) {
        //     System.out.println("both");
        // }
        // else if(!flagBulky && !flagMass) {
        //     System.out.println("Neither");
        // }
        // else if(flagBulky && !flagMass) {
        //     System.out.println("Bulky");
        // }
        // else if(!flagBulky && flagMass) {
        //     System.out.println("Heavy");
        // }
        // int[]  nums = {2,2,1};
        // int ans = 0;
        // for(int i = 0;i<nums.length;i++) {
        //     ans^=nums[i];
        // }
        // System.out.println(ans);
        // int[] position = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        // ArrayList<Integer> nums = new ArrayList<>();
        // ArrayList<Integer> count = new ArrayList<>();
        // nums.add(position[0]);
        // for(int i = 1;i<position.length;i++) {
        //     if(nums.get(nums.size() - 1) != position[i]) {
        //         nums.add(position[i]);
        //     }
        // }
        // System.out.println(nums);
        // int pos = 0;
        // int coun = 0;
        // for(int i = 0;i<position.length;i++) {
        //     int c = 0;
        //     for(int j = i + 1;j<position.length;j++) {
        //         if(position[i] == position[j]) {
        //             c++;
        //         }
        //     }
        //     System.out.println(c);
        //     if(coun < c) {
        //         coun = c;
        //         pos = position[i];
        //     }
        // }
        // System.out.println(pos);
        // int tot = 0;
        // for(int i = 0;i<position.length;i++) {
        //     if(position[i] != pos) {
        //         if((pos % 2 == 0 && position[i] % 2 == 1) || (pos % 2 == 1 && position[i] % 2 == 0)) {
        //             tot+=1;
        //         }
        //     }
        // }
        // // System.out.println(tot);
        // String columnTitle = new String("FXSHRXW");
        // int tot = 0;
        // int len = columnTitle.length() - 1;
        // for(int i = 0;i<columnTitle.length();i++) {
        //     int num = (int) columnTitle.charAt(i) - 64;
        //     tot+=num*Math.pow(26,len--);
        // }
        // System.out.println(tot);
        // String text = new String("balloon");
        // boolean run = true;
        // int count = 0;
        // String check = new String("balloon");
        // text = text.toLowerCase();
        // String res = new String();
        // while(run && text.length()!=0){
        //     for(int i = 0;i<check.length();i++) {
        //         for(int j = 0;j<text.length();j++) {
        //             if(check.charAt(i) == text.charAt(j)) {
        //                 res = res+""+check.charAt(i);
        //                 text = text.replaceFirst(check.charAt(i)+"","");
        //                 run = true;
        //                 break;
        //             }
        //             else {
        //                 run = false;
        //             }
        //         }
        //         if(!run) {
        //             break;
        //         }
        //     }
        // }
        // if(!res.contains("n")){
        //     System.out.println(0);
        // }
        // for(int i = 0;i<res.length();i++) {
        //     if(res.charAt(i) == 'n') {
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // int x = 4;
        // int y = 11;
        // if(x==0||y==0) {
        //     System.out.println("Bob");
        // }
        // int count = 0;
        // boolean flag = true;
        // while(flag) {
        //     if(x != 0) {
        //         if(y >= 4) {
        //             count++;
        //             y-=4;
        //             x--;
        //         }
        //         else {
        //             flag = false;
        //         }
        //     }
        //     else {
        //         flag = false;
        //     }
        // }
        // if(count%2==1) {
        //     System.out.println("Alice");
        // }
        // else {
        //     System.out.println("Bob");
        // }
        // String num = new String("52");
        // int max = 0;
        // for(int i = 0;i<num.length();i++) {
        //     String temp = new String(num.charAt(i)+"");
        //     int n = Integer.parseInt(temp);
        //     if(n%2==1 && max < n) {
        //         max = n;
        //     } 
        // }
        // System.out.println(max+"");;
        // String s = new String("dssa");
        // System.out.println(s.substring(0,4));
        System.out.println(7/2);
    }
}
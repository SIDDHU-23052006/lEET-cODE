import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        // System.out.println(7/2);
        // int n = 4;
        // if(n == 0) {
        //     System.out.println(0);
        // }
        // int res = -1;
        // int lsum = 0;
        // int msum = 0;
        // int i = 1;
        // int j = n;
        // while(i <= j) {
        //     if(i == j && lsum == msum) {
        //         res = i;
        //         break;
        //     }
        //     else if(lsum <= msum) {
        //         lsum += i;
        //         i++;
        //     }
        //     else if(lsum >= msum) {
        //         msum+=j;
        //         j--;
        //     }
        //     System.out.print(i+" "+j+" "+lsum+" "+msum);
        //     System.out.println();
        // }
        // String check = new String("adc");
        // String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        // int count = 0;
        // for(String str : words) {
        //     for(int i = 0;i<check.length();i++) {
        //         if(str.length() == 0) {
        //             break;
        //         }
        //         if(str.contains(check.charAt(i)+"")) {
        //             str = str.replaceAll(check.charAt(i)+"","");
        //         }
        //     }
        //     if(str.length() == 0) {
        //         count++;
        //     }
        // }
        // System.out.println(Arrays.toString(words));
        // System.out.println(count);
        // int[] position = {1,2,2,3,3};
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(position[position.length - 1]);
        // for(int i = position.length- 1;i>=0;i--) {
        //     if(nums.get(nums.size() - 1) != position[i]) {
        //         nums.add(position[i]);
        //     }
        // }
        // System.out.println(nums);
        // int pos = 0;
        // int coun = 0;
        // for(int i = 0;i<position.length;i++) {
        //     int c = 1;
        //     for(int j = i + 1;j<position.length;j++) {
        //         if(position[i] == position[j]) {
        //             c++;
        //         }
        //     }
        //     if(coun <= c) {
        //         coun = c;
        //         pos = position[i];
        //     }
        // }
        // System.out.println(pos);
        // int tot = 0;
        // for(int i = 0;i<position.length;i++) {
        //     if(position[i] != pos && (position[i]%2==1 && pos % 2== 0) || (position[i] % 2== 0 && pos % 2 == 1)) {
        //         tot+=1;
        //     }
        // }
        // System.out.println(tot);
        // String s = new String("1+1+1");
        // s = s.replaceAll(" ","");
        // String op = "/*+-";
        // for(int i = 0;i<op.length();i++) {
        //     for(int j = 0;j<s.length();j++) {
        //         if(op.charAt(i) == s.charAt(j)) {
        //             switch(op.charAt(i)) {
        //                 case '/':
        //                     int num1 =Integer.parseInt(s.charAt(j-1)+"");
        //                     int num2 = Integer.parseInt(s.charAt(j+1)+"");
        //                     int res = num1/num2;
        //                     s = s.replace(num1+"/"+num2,res+"");
        //                     break;
        //                 case '*':
        //                     int num3 =Integer.parseInt(s.charAt(j-1)+"");
        //                     int num4 = Integer.parseInt(s.charAt(j+1)+"");
        //                     int res1 = num3*num4;
        //                     s = s.replace(num3+"*"+num4,res1+"");
        //                     break;
        //                 case '+':
        //                     int num5 =Integer.parseInt(s.charAt(j-1)+"");
        //                     int num6 = Integer.parseInt(s.charAt(j+1)+"");
        //                     int res2 = num5+num6;
        //                     s = s.replace(num5+"+"+num6,res2+"");
        //                     break;
        //                 case '-':
        //                     int num7 =Integer.parseInt(s.charAt(j-1)+"");
        //                     int num8 = Integer.parseInt(s.charAt(j+1)+"");
        //                     int res3 = num7-num8;
        //                     s = s.replace(num7+"-"+num8,res3+"");
        //                     break;
        //                 default:
        //                     break;
        //             }
        //         }
        //     }
        // }
        // System.out.println(Integer.parseInt(s));
        // int[] arr = {0};
        // System.out.println(arr);
        // System.out.println((int)1/2);
        // int[] nums = {1,2,2,3};
        // int target = 2;
        // int count = 0;
        // int i = 0;
        // while(i<nums.length) {
        //     int left;
        //     int right;
        //     System.out.println("left "+i);
        //     for(left = 0;left<=i;left++){
        //         int length = i - left+1;
        //         int temp = 0;
        //         for(int j = left;j<=i;j++) {
        //             if(nums[j]==target && length != 1) {
        //                 temp++;
        //             }
        //         }
        //         System.out.println(length+" "+temp*2);
        //         if(temp*2 > length) {
        //             count++;
        //         }
        //     }
        //     System.out.println("right "+i);
        //     for(right = nums.length - 1;right>=i;right--) {
        //         int temp = 0;
        //         int length = right - i+1;
        //         for(int j = right;j>=i;j--) {
        //             if(nums[j]==target && length != 1) {
        //                 temp++;
        //             }
        //         }
        //         System.out.println(length+" "+temp*2);
        //         if(temp*2 > length) {
        //             count++;
        //         }
        //     }
        //     System.out.println("count"+count);
        //     i++;
        // }
        // System.out.println(count);
    //     int[] nums = {3,1,3,4,2};
    //     int i = 0;
    //     int count = 0;
    //     int num = 0;
    //     while(i < nums.length) {
    //         int temp = 0;
    //         int left = 0;
    //         int right = nums.length - 1;
    //         while(left < right) {
    //             if(nums[left] == nums[i]) {
    //                 temp++;
    //             }
    //             if(nums[right] == nums[i]) {
    //                 temp++;
    //             }
    //             left++;
    //             right--;
    //         }
    //         System.out.println(nums[i]+"->"+temp);

    //         if(temp > count) {
    //             count = temp;
    //             num = nums[i];
    //             System.out.println(nums[i]);
    //         }
    //         i++;
    //     }
    //     System.out.println(num);
    // }
    // String s = new String("abcabc");
    // // System.out.println(s.contains("abc"));
    // String temp = new String(s);
    // String c = new String();
    // while(temp.length() != 0) {
    //     if(!(c.contains(temp.charAt(0)+""))) {
    //         c = c+""+temp.charAt(0);
    //         temp = temp.replaceAll(temp.charAt(0)+"","");
    //     }
    // }
    // int win = c.length();
    // System.out.println(win);
    // System.out.println(c);
    // int count = 0;
    // while(win > s.length()) {
    //     int i = 0;
    //     int j = win;
    //     while(j > s.length()) {
            
    //     }
    // }
    // int n =sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0;i<n;i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println(Arrays.toString(arr));
    //     int n1 = sc.nextInt();
    //     int[] arr1 = new int[n1];
    //     for(int j = 0;j<n1;j++) {
    //         arr[j] = sc.nextInt();
    //     }
    //     System.out.println(Arrays.toString(arr1));
    //     if(n != n1) {
    //         System.out.println("Incompatible");
    //         return;
    //     }
    //     boolean flag = true;
    //     for(int i = 0;i<n;i++) {
    //         for(int j = 0;j<n1;j++) {
    //                 if(!(arr[i] >= arr1[j])) {
    //                 flag = false;
    //                 break;
    //             }
    //             System.out.println(arr[i]+" "+arr1[j]+" "+flag);
    //         }
    //         if(!flag) {
    //             break;
    //         }
    //     }
    //     if(flag) System.out.println("Compatible");
    //     else System.out.println("Incompatible");
    // int num = sc.nextInt();
    //     int p = num*num;
    //     int count = 0;
    //     int temp = num;
    //     while(temp > 0) {
    //         count++;
    //         temp/=10;
    //     }
    //     double s = Math.pow(10,count);
    //     int split = (int)s;
    //     int a = p % split;
    //     int b = p / split;
    //     System.out.println(p);
    //     System.out.println(a+" "+b);
    //     System.out.println(a+b);
    //     if(num == a+b) System.out.println("Kaprekar number");
    //     else System.out.println("Not a Kaprekar number");
    int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int i = 0;
        int temp = m;
        while(arr.length > i) {
            System.out.println("temp "+temp+" arr "+arr[i]+" index "+i);
            if(temp - arr[i] > 0) {
                temp = temp - arr[i];
                arr[i] = 0;
            }
            else if(temp - arr[i] < 0) {
                arr[i] = arr[i] - temp;
                temp = 0;
                count++;
            }
            else {
                temp = 0;
                arr[i] = 0;
                count++;
            }
            if(temp == 0) {
                temp = m;
            }
            if(arr[i] == 0) {
                i++;
            }
            System.out.println(count);
            
        }
        int b = arr.length-1;
        while(arr[b] != 0) {
            System.out.println("temp "+temp+" arr "+arr[b]+" count "+count+" index "+b);
            if(temp - arr[b] > 0) {
                temp = temp - arr[b];
                arr[b] = 0;
            }
            else if(temp - arr[b] < 0) {
                arr[b] = arr[b] - temp;
                temp = 0;
                count++;
            }
            else {
                temp = 0;
                arr[b] = 0;
                count++;
            }
            if(temp == 0) {
            }
            if(arr[b] == 0) {
                b--;
            }
            
        }
        System.out.println(count);
    }
}
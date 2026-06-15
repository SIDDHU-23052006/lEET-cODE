public class Solutions {
    static public String sortSentence(String s) {
        int n = 1;
        String res = new String();
        while(s.length() != n) {
            boolean flag = false;
            String temp = new String();
            for(int i = 0;i<s.length();i++) {
                if((s.charAt(i)+"").equals(n+"")) {
                    for(int j = i;j>=0 &&s.charAt(j)!=' ';j--) {
                        temp = s.substring(j + 1,i - 1);
                        flag = true;
                        System.out.println(temp);
                    }
                }
                else{
                    n = s.length();
                    break;
                }
                if(flag == true) {
                    res+=temp+" ";
                }
            }
            if(n!=s.length()) {
                n++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Solutions.sortSentence("is2 sentence4 This1 a3"));
    }
}
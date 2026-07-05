import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            // Remove carriage return characters to ensure cross-platform compatibility
            s = s.replace("\r", "");
            
            char result = '\0';
            boolean found = false;
            
            // Loop through all characters (not just letters) as the problem is "First non-repeating character"
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (s.indexOf(c) == s.lastIndexOf(c)) {
                    result = c;
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println(result);
            } else {
                System.out.println("All characters are repetitive");
            }
        }
        sc.close();
    }
}

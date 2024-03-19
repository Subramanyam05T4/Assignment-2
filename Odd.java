import java.util.*;

class Odd {
    public static void main(String args[]) {
        System.out.print("Enter string:");
        Scanner s = new Scanner(System.in);
        String z = s.nextLine();
        char[] s1 = new char[50]; // Change char to char[]
        int i = 0, o = 0;
        for (i = 0; i < z.length(); i++) {
            if (i % 2 != 0) {
                s1[o] = z.charAt(i);
                o++;
            }
        }
        System.out.print(s1);
    }
}

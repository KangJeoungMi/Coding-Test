import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String a_re = a.replaceAll(" ","");
        
        String b_re = b.replaceAll(" ","");
        System.out.println(a+b);
    }
}
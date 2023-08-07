import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //String[] split : 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴함 
        String[] list = a.split("");
        
        //반복문
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
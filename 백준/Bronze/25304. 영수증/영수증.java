import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); // 영수증에 적힌 총 금액
    int n = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
    int total = 0;

    for (int i = 0; i < n; i++) {
        int a = sc.nextInt(); // 각 물건의 가격
        int b = sc.nextInt(); // 각 물건의 갯수
        total += a * b;
    }
    if (total == x) {
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
   }
}

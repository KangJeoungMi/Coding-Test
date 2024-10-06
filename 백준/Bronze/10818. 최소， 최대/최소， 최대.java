import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] n = new int[a];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a; i++){
            n[i] = sc.nextInt(); // 배열의 값 저장
        }

        for (int i=0; i<a; i++){
            if(n[i]<min) {min = n[i];}
            if(n[i]>max) {max = n[i];}

        }
        System.out.printf("%d %d", min, max);

        sc.close();
    }

}

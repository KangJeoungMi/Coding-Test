import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = "";
		sc.close();
		for (int i=1; i<=N; i++) {
			if(i%4==0) {
				System.out.print("long ");
			}
		}
		System.out.println("int");		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] al = new int[26];
		
		for(int i=0; i<al.length; i++) {
			al[i] = -1;
		}
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(al[ch - 'a']==-1) {
				al[ch-'a'] = i;
			}
		}
		for(int val:al) {
			System.out.print(val+" ");
		}
	}
}

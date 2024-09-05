import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
        StringTokenizer st;

        for (int i = 1; i <= testCaseCount; i++) {
            // 한 줄씩 읽어서 StringTokenizer로 처리
            st = new StringTokenizer(br.readLine(), " ");

            // 토큰이 2개인지 확인
            if (st.countTokens() < 2) {
                bw.write("입력 오류: 충분한 숫자가 입력되지 않았습니다.\n");
                continue;
            }

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

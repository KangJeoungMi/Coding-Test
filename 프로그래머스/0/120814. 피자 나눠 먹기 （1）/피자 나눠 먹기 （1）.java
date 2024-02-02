class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n/7;
        if(1<=n%7 && n%7<=6){
           answer+=1;
        }
       
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));;
        int sum2 = 2*a*b;
        if(sum>sum2){
            answer = sum;
        }else if(sum==sum2){
            answer=sum;
        }else if(sum<sum2){
           answer=sum2;} 
        return answer;
    }
}
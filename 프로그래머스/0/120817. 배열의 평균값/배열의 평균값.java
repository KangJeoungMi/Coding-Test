class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int n = 0;
        for(int i=0; i<numbers.length;i++){
            n+= numbers[i];
        }
        
        answer = (double)n/numbers.length;
        return answer;
    }
}
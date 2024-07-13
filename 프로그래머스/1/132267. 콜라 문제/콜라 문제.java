class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int newColas = (n / a) * b;
            int nBottles = n % a;
            
            answer += newColas;
            n = newColas + nBottles;
        }
        return answer;
    }
}
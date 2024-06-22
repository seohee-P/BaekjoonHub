class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대 공약수 찾기
        for (int i = Math.min(n,m); i > -1; i--){
            if (n%i == 0 && m%i == 0){
                answer[0] = i;
                break;
            }
        }
        answer[1] = n*m/answer[0];
        
        return answer;
    }
}
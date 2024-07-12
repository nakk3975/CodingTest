class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);
            
            if (width > maxWidth) {
                maxWidth = width;
            }
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        answer =  maxWidth * maxHeight;
        
        return answer;
    }
}
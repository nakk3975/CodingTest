import java.util.Stack;

class Solution {

    public int[] solution(int[] numbers) {

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        // 첫 번째 인덱스 stack에 push
        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            // 스택이 비어있지 않고 현재 스택이 바라보고 있는 값보다 값이 크면 뒤에 값이 큰 수
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                // 뒤에 있는 큰 수에 해당하는 모든 값 pop
                answer[stack.pop()] = numbers[i];
            }
            // 현재 인덱스 push
            stack.push(i);
        }
        // 모든 index를 탐색 후 뒤에 있는 큰 수가 없는 경우 -1 
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
class Solution {
    int answer = 0;
      public int solution(int[] numbers, int target) {
        DFS(numbers, 0, 0, target);  // depth = 0, sum = 0
        return answer;
    }

    public void DFS(int[] numbers, int depth, int sum, int target) {
        // 모든 숫자를 다 사용한 경우
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;  // 타겟 넘버를 만든 경우
            }
            return;
        }

        // 현재 숫자를 더한 경우
        DFS(numbers, depth + 1, sum + numbers[depth], target);

        // 현재 숫자를 뺀 경우
        DFS(numbers, depth + 1, sum - numbers[depth], target);
    }
}